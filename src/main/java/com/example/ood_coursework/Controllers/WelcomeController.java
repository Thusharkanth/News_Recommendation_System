package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;

public class WelcomeController {
    @FXML
    public void adminLoginButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/admin-login.fxml","Admin Login",currentStage);
    }

    @FXML
    public void UserLoginButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-login.fxml","User Login",currentStage);
    }
}
