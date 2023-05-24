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

  // stage change
  @FXML
  protected void takeToLogIn() throws IOException {
    ChatBPTApplication app = new ChatBPTApplication();
    app.resetStage("login.fxml", "ChatBPT - Log In", 934, 594);
  }

  // scene changes
  @FXML void takeToChatGroup() throws IOException {
    ChatBPTApplication app = new ChatBPTApplication();
    app.changeScene("chatGroup.fxml");
  }

  @FXML void takeToChat() throws IOException {
    ChatBPTApplication app = new ChatBPTApplication();
    app.changeScene("chat.fxml");
  }

  @FXML void takeToSettingsUser() throws IOException {
    ChatBPTApplication app = new ChatBPTApplication();
    app.changeScene("settingsUser.fxml");
  }

  @FXML void takeToSettings() throws IOException {
    ChatBPTApplication app = new ChatBPTApplication();
    app.changeScene("settings.fxml");
  }
}