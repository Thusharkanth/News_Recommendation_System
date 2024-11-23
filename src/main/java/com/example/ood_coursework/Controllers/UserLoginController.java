package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;

public class UserLoginController {
    @FXML
    public void loginButton(ActionEvent event) {
        // to handle login calling the method handleLogin ()
        handleLogin(event);

        // direct to new interface -- calling navigateTo()
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-dashboard .fxml","User DashBoard ",currentStage);
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

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    //Variavle to store password and username

    private String username;
    private String password;

    public void handleLogin(ActionEvent event) {
        username = usernameField.getText();
        password = passwordField.getText();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

}

