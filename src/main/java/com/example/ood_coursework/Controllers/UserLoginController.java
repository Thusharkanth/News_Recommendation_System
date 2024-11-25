//package com.example.ood_coursework.Controllers;
//
//import com.example.ood_coursework.DBConnector.dbConnector;
//import com.mongodb.client.MongoCollection;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//import org.bson.Document;
//
//import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;
//import static com.example.ood_coursework.ProjectManager.ProjectManager.showAlert;
//
//public class UserLoginController {
//    @FXML
//    public void loginButton(ActionEvent event) {
//        // to handle login calling the method handleLogin ()
//        handleLogin(event);
//
//        // direct to new interface -- calling navigateTo()
//        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
//        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-dashboard .fxml","User DashBoard ",currentStage);
//    }
//
//    @FXML
//    public void createAccountButton(ActionEvent event) {
//        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
//        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-create-account.fxml","Create Account ",currentStage);
//    }
//
//    @FXML
//    public void BackTowelcomePageButton(ActionEvent event) {
//        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
//        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/welcome-page.fxml","Create Account ",currentStage);
//    }
//
//    @FXML
//    private TextField usernameField;
//
//    @FXML
//    private PasswordField passwordField;
//
//    //Variavle to store password and username
//
// ;
//
//    public void handleLogin(ActionEvent event) {
//        String username = usernameField.getText();
//        String password = passwordField.getText();
//
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//
//        if (username.isEmpty()||password.isEmpty()){
//            showAlert("ERROR","ERROR","Field found Empty ","Please fill in all the field");
//            return;
//        }
//
//       // MongoCollection<Document> userCollection = dbConnector.getUserCollection();
//
//        Document query = new Document("username",username).append("password",password);
//        Document user = userCollection.find(query).first();
//
//        if (user != null){
//            showAlert("Information","Logined","Sucessfull","Login successful ");
//            }
//        else {
//            showAlert("Error", "Error ","Error","Invalid username or password");
//        }
//    }
//
//}
//
