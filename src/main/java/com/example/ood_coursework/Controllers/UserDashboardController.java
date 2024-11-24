package com.example.ood_coursework.Controllers;

import com.example.ood_coursework.ProjectManager.ProjectManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;
import static com.example.ood_coursework.ProjectManager.ProjectManager.showAlert;

public class UserDashboardController {
    @FXML
    public void logoutButton(ActionEvent event) {
        showAlert("CONFIRMATION", "confermation", "Confirm ", "Do you want to log Out.");
        ProjectManager.logoutProcess(event);
    }

    @FXML
    public void UserviewArticlesButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-view-articles.fxml","View Articles ",currentStage);
    }

    @FXML
    public void UserRecommendArticles(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/get-recommendation.fxml","Recommended Articles  ",currentStage);
    }

    @FXML
    public void UserManageProfile(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-manage-profile.fxml","Manage Profile",currentStage);
    }
}
