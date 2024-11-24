package com.example.ood_coursework.ProjectManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class ProjectManager {

    // Method to display new interface
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

    // Method to control logout process
    public static void logoutProcess(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();  // This will close the current window
    }

    // Method to give alert massages
    public static void showAlert(String type, String title, String header, String content) {
        Alert.AlertType alertType;

        // Convert string type to AlertType enum
        switch (type.toUpperCase()) {
            case "ERROR":
                alertType = Alert.AlertType.ERROR;
                break;
            case "INFORMATION":
                alertType = Alert.AlertType.INFORMATION;
                break;
            case "WARNING":
                alertType = Alert.AlertType.WARNING;
                break;
            case "CONFIRMATION":
                alertType = Alert.AlertType.CONFIRMATION;
                break;
            default:
                // If type is unrecognized, default to INFORMATION
                alertType = Alert.AlertType.INFORMATION;
                break;
        }

        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }



}
