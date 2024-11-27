package Model;

import java.util.List;

public class User {
    private String userId;
    private String username;
    private String password;
    private String email;
    private List<String> preferences;
    private List<String> readingHistory;

    public  User(String userId, String username, String password, String email, List<String> preferences, List<String> readingHistory) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.preferences = preferences;
        this.readingHistory = readingHistory;
    }

    public String getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public List<String> getPreferences() {
        return preferences;
    }
    public List<String> getReadingHistory() {
        return readingHistory;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPreferences(List<String> preferences) {
        this.preferences = preferences;
    }
    public void setReadingHistory(List<String> readingHistory) {
        this.readingHistory = readingHistory;
    }

}
