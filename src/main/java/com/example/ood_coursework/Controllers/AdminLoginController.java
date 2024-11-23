package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;

public class AdminLoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    //Variavle to store password and username

    private String adminUsername;
    private String adminPassword;


    @FXML
    public void adminloginButton(ActionEvent event) {
        // to handle login calling the method handleLogin ()
        handleAdminLogin(event);

        // direct to new interface -- calling navigateTo()
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/admin-dashboard.fxml","Admin DashBoard ",currentStage);
    }

    @FXML
    public void BackToWelcomPage(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/welcome-page.fxml","Admin DashBoard ",currentStage);

    }

    public void handleAdminLogin(ActionEvent event) {
        adminUsername = usernameField.getText();
        adminPassword = passwordField.getText();

        System.out.println("adminUsername: " + adminUsername);
        System.out.println("adminPassword: " + adminPassword);
    }
}
