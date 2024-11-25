package com.example.ood_coursework.Controllers;

import com.example.ood_coursework.DBConnector.DBOperations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;
import static com.example.ood_coursework.ProjectManager.ProjectManager.showAlert;



public class UserLoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private static final String COLLECTION_NAME ="users";



    @FXML
    public void loginButton(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        if (!(username.isEmpty()||password.isEmpty())){

             if (DBOperations.validateCredentials(COLLECTION_NAME,username,password)){

                    // direct to new interface -- calling navigateTo()
                    Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
                    navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-dashboard .fxml","User DashBoard ",currentStage);
                }
                else {
                            showAlert("Error","ERROR","Invalid Username or Password","Please try again with correct credentials.");
                    }

        }
        else {
            showAlert("ERROR","ERROR","Field found Empty ","Please fill in all the field");

        }

        }




    @FXML
    public void createAccountButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-create-account.fxml","Create Account ",currentStage);
    }

    @FXML
    public void BackTowelcomePageButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/welcome-page.fxml","Create Account ",currentStage);
    }





    public void handleLogin(ActionEvent event) {







    }

}

