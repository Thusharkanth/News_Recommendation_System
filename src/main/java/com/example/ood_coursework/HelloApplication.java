package com.example.ood_coursework;

import com.example.ood_coursework.DBConnector.MongoDBConnector;
import com.mongodb.client.MongoDatabase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/ood_coursework/FXML files/FXML Files/welcome-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Personalized News Recommendation System");
        stage.setScene(scene);
        stage.show();
    }
    // Create MongoDB connection and UserService
    MongoDatabase database = MongoDBConnector.getDatabase();


    public static void main(String[] args) {
        launch();
    }
}