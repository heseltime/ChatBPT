package at.fhooe.chatbpt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  private static Stage stage;
  @Override
  public void start(Stage primaryStage) throws IOException {
    stage = primaryStage;
    primaryStage.setResizable(false);
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 934, 594);
    stage.setTitle("ChatBPT");
    stage.setScene(scene);
    stage.show();
  }

  public void changeScene(String fxml) throws IOException {
    Parent pane = FXMLLoader.load(getClass().getResource(fxml));
    stage.getScene().setRoot(pane);
  }

  public static void main(String[] args) {
    launch();

  }
}