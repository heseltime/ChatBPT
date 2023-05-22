module at.fhooe.chatbpt {
  requires javafx.controls;
  requires javafx.fxml;


  opens at.fhooe.chatbpt to javafx.fxml;
  exports at.fhooe.chatbpt;
}