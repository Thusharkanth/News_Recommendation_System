package com.example.ood_coursework.Controllers;

import com.example.ood_coursework.DBConnector.DBOperations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;
import static com.example.ood_coursework.ProjectManager.ProjectManager.showAlert;

public class AdminLoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private static final String COLLECTION_NAME ="admin";




    @FXML
    public void adminloginButton(ActionEvent event) {

            String adminUsername = usernameField.getText();
            String adminPassword = passwordField.getText();

            System.out.println("adminUsername: " + adminUsername);
            System.out.println("adminPassword: " + adminPassword);

                if (!(adminUsername.isEmpty()||adminPassword.isEmpty())){

                    if(DBOperations.validateCredentials(COLLECTION_NAME,adminUsername,adminPassword)){

                        // direct to new interface -- calling navigateTo()
                        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
                        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/admin-dashboard.fxml","Admin DashBoard ",currentStage);
                    }

                    else {
                        showAlert("Error","ERROR","Invalid Username or Password","Please try again with correct credentials.");

                    }
                }else {
                    showAlert("ERROR","ERROR","Field found Empty ","Please fill in all the field");

                }


        }

    @FXML
    public void BackToWelcomPage(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/welcome-page.fxml","Admin DashBoard ",currentStage);

    }

    public void handleAdminLogin(ActionEvent event) {

    }
}
