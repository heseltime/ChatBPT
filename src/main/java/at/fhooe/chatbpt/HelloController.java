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

  @FXML
  protected void userLogin() throws IOException {
    checkLogin();
  }

  private void checkLogin() throws IOException {
    //Main m = new Main();
    if(username.getText().toString().equals("javacoding") && password.getText().toString().equals("123")) {
      //wrongLogin.setText("Success!");
    } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
      wrongLogin.setText("Please enter your login information");
    } else {
      wrongLogin.setText("Wrong username or password");
    }
  }
}