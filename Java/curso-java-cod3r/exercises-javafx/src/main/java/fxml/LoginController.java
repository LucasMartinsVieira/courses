package fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    public void login() {
        boolean isEmailValid = emailField.getText().equals("lucas@email.com");
        boolean isPasswordValid = passwordField.getText().equals("123456");

        if (isEmailValid && isPasswordValid) {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Signed in successfully")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("User and/or password invalid")
                    .showError();
        }

    }
}
