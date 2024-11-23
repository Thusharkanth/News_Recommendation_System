package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;

public class UserLoginController {
    @FXML
    public void loginButton(ActionEvent event) {
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
}
