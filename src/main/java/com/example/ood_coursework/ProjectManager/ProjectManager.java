package com.example.ood_coursework.ProjectManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class ProjectManager {

    public static  void navigateTo(String fxmlPath, String title, Stage currentStage) {
        try {
            // Load the FXML file
            FXMLLoader fxmlLoader = new FXMLLoader(ProjectManager.class.getResource(fxmlPath));
            Parent root = fxmlLoader.load();

            // Create a new stage
            Stage newStage = new Stage();
            newStage.setTitle(title);
            newStage.setScene(new Scene(root));
            newStage.show(); // Display the new stage

            // Close the current stage
            if (currentStage != null) {
                currentStage.close();}


            }
        catch (IOException e) {
            e.printStackTrace(); // Print error if FXML loading fails
        }

}
    public static void logoutProcess(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();  // This will close the current window
    }


}
