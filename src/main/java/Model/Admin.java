package Model;

import java.util.List;



public class Admin extends User {
    private  String adminID;

    public Admin(String userId, String username, String password, String email, List<String> preferences, List<String> readingHistory, String adminID) {
        super(userId, username, password, email, preferences, readingHistory);
        this.adminID=adminID;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

   public void administerArticle(){}

    public  void categorizeArticles(){}

    public void manageUsers(){}
}
