package at.fhooe.chatbpt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
  @FXML
  private Button button;

  @FXML
  private Label wrongLogin;

  @FXML
  private TextField username;

  @FXML
  private PasswordField password;

  protected void sayHello() {
    wrongLogin.setText("Welcome to JavaFX Application!");
  }

  @FXML
  protected void userLogin() {
    checkLogin();
  }

  private void checkLogin() {

  }
}