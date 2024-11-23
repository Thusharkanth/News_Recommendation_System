package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;

public class CreateAccountController {
    public void createAccountButton(ActionEvent event) {
    }

    public void BackToLoginButton1(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-login.fxml","User Login ",currentStage);

    }
}
