package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.*;

public class AdminDashboardController {
    @FXML
    public void viewUserButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/admin-view-User.fxml","User Details ",currentStage);

    }

    @FXML
    public void logoutButton(ActionEvent event) {
        showAlert("Confrimation","Confimation ","confirm","Do you want to Log Out ");
        logoutProcess(event);
    }

    @FXML
    public void EditDeleteArtiButton1(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/admin-edit-articles.fxml","Edit Articles  ",currentStage);

    }
    @FXML
    public void AddArticlesButton11(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/admin-add-articles.fxml","Edit Articles ",currentStage);

    }
}
