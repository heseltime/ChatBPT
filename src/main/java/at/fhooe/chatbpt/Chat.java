package at.fhooe.chatbpt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Chat {
  @FXML
  private Button button;

  @FXML
  private Label wrongLogin;

  @FXML
  private TextField username;

  @FXML
  private PasswordField password;

  @FXML
  protected void takeToLogIn() throws IOException {
    ChatBPTApplication app = new ChatBPTApplication();
    app.resetStage("login.fxml", "ChatBPT - Log In", 934, 594);
  }
}