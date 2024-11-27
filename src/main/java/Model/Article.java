package Model;

import java.util.List;

public class Article {
    private String articleID;
    private String articleTitle;
    private String articleAuthor;
    private String content;
    private String articleCategory;
    private List<Integer> ratings;

    public Article(String articleID, String articleTitle, String articleAuthor, String content, String articleCategory) {
        this.articleID = articleID;
        this.articleTitle = articleTitle;
        this.articleAuthor = articleAuthor;
        this.content = content;
        this.articleCategory = articleCategory;


    }
    public String getArticleID() {
        return articleID;
    }
    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }
    public String getArticleTitle() {
        return articleTitle;
    }
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
    public String getArticleAuthor() {
        return articleAuthor;
    }
    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;

    }
    public String getContent() {
        return content;

    }
    public void setContent(String content) {
        this.content = content;

    }
    public String getArticleCategory() {

        return articleCategory;
    }
    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;


    }
    public List<Integer> getRatings() {
        return ratings;

    }
    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }


}

