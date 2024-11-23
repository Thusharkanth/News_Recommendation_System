package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;

public class GetRecommendationController {
    @FXML
    public void backButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-dashboard .fxml","User DashBoard ",currentStage);
    }

    @FXML
    public void previousButton(ActionEvent event) {
    }

    @FXML
    public void NextButton1(ActionEvent event) {
    }

    @FXML
    public void SubmitRatingButton(ActionEvent event) {
    }
}
