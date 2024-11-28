package com.example.ood_coursework.Controllers;

import com.example.ood_coursework.DBConnector.DBOperations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.List;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;
import static com.mongodb.client.model.Filters.eq;

public class ViewArticlesController {

    @FXML
    private Label titleLabel;

    @FXML
    private Label authorLabel;

    @FXML
    private TextArea articleContentArea;

    @FXML
    private ComboBox<Integer> ratingComboBox;

    private int currentIndex = 0;
    private List<Document> articles;
    private String  userID= "User1";

    public void initialize() {

        // Fetch articles from the database using DBOperations

        articles= DBOperations.findAll("articles");

        if (articles != null &&!articles.isEmpty()) {
            displayArticle();
        }

        else {
            articleContentArea.setText("No articles available.");
        }

        ratingComboBox.getItems().clear();  //clearing existing items
        for (int i=1;i<=5;i++) {
            ratingComboBox.getItems().add(i);
        }

    }


    @FXML
    public void backButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-dashboard .fxml","User DashBoard ",currentStage);
    }

    @FXML
    public void previousButton(ActionEvent event) {
        if (currentIndex > 0) {
            currentIndex--;
            displayArticle();

        }
    }

    @FXML
    public void NextButton1(ActionEvent event) {

        if (currentIndex < articles.size() - 1) {
            currentIndex++;
            displayArticle();
        }
    }

    @FXML
    public void SubmitRattingButton(ActionEvent event) {

        // Get the current article information
        Document currentArticle = articles.get(currentIndex);
        String articleID = currentArticle.getString("articleId");
        Integer rating = ratingComboBox.getSelectionModel().getSelectedItem();


            boolean hasRated = hasUserRated(userID,articleID);

            if (hasRated){
                // If the user has already rated, update the rating using the DBOperations method
                Bson filter = eq("username",userID);
                Bson update = new Document("$set", new Document("rating",rating));
                boolean success = DBOperations.updateDocument("rating",filter,update);


            }
            else {
                // Create a rating entry Document
                Document ratingEntry = new Document("username",userID)
                        .append("articleId", articleID);


                if (rating != null) {
                    ratingEntry.append("rating", rating);
                }


                boolean success = DBOperations.insertDocument("rating", ratingEntry);

                if (success) {
                    articleContentArea.setText("Rating submitted successfully!");
                } else {
                    articleContentArea.setText("Failed to submit rating.");

                }

            }

    }

    //Helper method to check if the user has already rated the current article

    private boolean hasUserRated(String userID, String articleID) {
        Bson filter = eq("username",userID);
        Document ratingDocument = DBOperations.findDocument("rating",filter);

        if (ratingDocument != null && ratingDocument.getString("articleId").equals(articleID)) {
            return true;
        }
        return false;
    }

    private void displayArticle() {

        Document currentArticle = articles.get(currentIndex);

        titleLabel.setText(currentArticle.getString("title"));
        authorLabel.setText(currentArticle.getString("author"));
        articleContentArea.setText(currentArticle.getString("content"));

        ratingComboBox.getSelectionModel().clearSelection();
    }
}
