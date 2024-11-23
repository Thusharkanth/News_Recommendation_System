package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;

public class AdminLoginController {
    @FXML
    public void adminloginButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/admin-dashboard.fxml","Admin DashBoard ",currentStage);
    }

    @FXML
    public void BackToWelcomPage(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/welcome-page.fxml","Admin DashBoard ",currentStage);

    }
}
