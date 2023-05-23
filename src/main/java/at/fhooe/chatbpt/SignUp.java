package at.fhooe.chatbpt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignUp {
  @FXML
  private Button button;

  @FXML
  private Label wrongLogin;

  @FXML
  private TextField username;

  @FXML
  private PasswordField password;

  @FXML
  protected void userSignUp() throws IOException {
    checkSignUp();
  }

  private void checkSignUp() throws IOException {
    ChatBPTApplication app = new ChatBPTApplication();
    if(username.getText().toString().equals("javacoding") && password.getText().toString().equals("123")) {
      wrongLogin.setText("Success!");
      app.resetStage("chat.fxml", "ChatBPT - Chat", 1500, 1000);
    } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
      wrongLogin.setText("Please enter signup information");
    }
  }

  @FXML
  protected void takeToLogIn() throws IOException {
    ChatBPTApplication app = new ChatBPTApplication();
    app.changeScene("logIn.fxml");
  }
}