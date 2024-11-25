package com.example.ood_coursework.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static com.example.ood_coursework.ProjectManager.ProjectManager.navigateTo;
import static com.example.ood_coursework.ProjectManager.ProjectManager.showAlert;

public class CreateAccountController {
    @FXML
    public void createAccountButton(ActionEvent event) {
        // call the method to verify the detail
        boolean isValid= handleSignIn();

        // directed to a new interface
        if (isValid) {
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-dashboard .fxml", "User DashBoard  ", currentStage);
        }
    }

    @FXML
    public void BackToLoginButton1(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        navigateTo("/com/example/ood_coursework/FXML files/FXML Files/user-login.fxml","User Login ",currentStage);

    }

    @FXML
    private TextField usernameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;


    private String user_username;
    private String user_email;
    private String user_password;
    private String user_confirmPassword;

    public boolean handleSignIn() {
        user_username=usernameField.getText();
        user_email = emailField.getText();
        user_password=passwordField.getText();
        user_confirmPassword=confirmPasswordField.getText();

        if (user_username.isEmpty() || user_email.isEmpty() || user_password.isEmpty() || user_confirmPassword.isEmpty()) {
            showAlert("Information","Information","Empty field present ","Very field should be completed ");
            System.out.println("Username or email or password is empty");
            return false;
        }
        if (!user_password.equals(user_confirmPassword)) {
            showAlert("error","Error","Password mismatch", " Password did not mactch");
            System.out.println("Passwords do not match");
            return false;
        }

        System.out.println("Sign Up Successful!");
        System.out.println("Username: " + user_username);
        System.out.println("Email: " + user_email);
        return true;

    }

}
