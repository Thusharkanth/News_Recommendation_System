package com.example.ood_coursework.Controllers;

import com.example.ood_coursework.DBConnector.DBOperations;
import com.example.ood_coursework.DBConnector.MongoDBConnector;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.bson.Document;

import static com.example.ood_coursework.ProjectManager.ProjectManager.*;
//import static jdk.internal.org.jline.utils.AttributedStringBuilder.append;

public class CreateAccountController {
    @FXML
    public void createAccountButton(ActionEvent event) {
        // call the method to verify the detail
        boolean isValid= handleSignIn(event);


    }

    @FXML
    public void BackToLoginButton1(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-login.fxml","User Login ",currentStage);

    }

    @FXML
    private TextField usernameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    private static final String USERS_COLLECTION = "users";





    public boolean handleSignIn(ActionEvent event) {
        String  user_username=usernameField.getText();
        String user_email = emailField.getText();
        String user_password=passwordField.getText();
        String user_confirmPassword=confirmPasswordField.getText();

        if (user_username.isEmpty() || user_email.isEmpty() || user_password.isEmpty() || user_confirmPassword.isEmpty()) {
            showAlert("Information","Information","Empty field present ","Very field should be completed ");
            System.out.println("Username or email or password is empty");
            return false;
        }

        if (!user_password.equals(user_confirmPassword)) {
            showAlert("error","Error","Password mismatch", " Password did not mactch");
            System.out.println("Passwords do not match");
            return false;
        }

        if(isDuplicate(user_username,user_email)){
            showAlert("error","ERROR","Duplicate Entry","Username or email already exists. Please try again.");
            highlightDuplicates(user_username,user_email);
            return false;
        }

        /// Create user document
        Document userDocument = new Document("username",user_username)
        .append("email",user_email)
                .append("password",user_password)
                        .append("preferences",new org.bson.Document())
                                .append("readingHistory", new org.bson.Document());

        // insertinf into db

        if (DBOperations.insertDocument(USERS_COLLECTION,userDocument)){
            showAlert("information","Success","Success","Account created successfully!");
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-dashboard .fxml", "User DashBoard  ", currentStage);

        }
        else {
            showAlert("error","ERROR","ERROR","An error occurred while creating your account. Please try again");
        }


        System.out.println("Sign Up Successful!");
        System.out.println("Username: " + user_username);
        System.out.println("Email: " + user_email);
        return true;

    }

   //------------------------------------------------------------------------

    private boolean isDuplicate(String username, String email) {
        MongoCollection<Document> collection= MongoDBConnector.getDatabase().getCollection(USERS_COLLECTION);

        // check dulipcation of username and email
        long count = collection.countDocuments(Filters.or(Filters.eq("username", username), Filters.eq("email", email)));
        return count >0;
    }

    private void highlightDuplicates(String username, String email) {
        MongoCollection<Document> collection = MongoDBConnector.getDatabase().getCollection(USERS_COLLECTION);

        if (collection.countDocuments(Filters.eq("username", username)) > 0) {
            highlightField(usernameField);
        }
        if (collection.countDocuments(Filters.eq("email", email)) > 0) {
            highlightField(emailField);
        }
    }

    private void highlightField(TextField field) {
        field.setStyle("-fx-border-color: red; -fx-border-width: 2px;");
    }

}
