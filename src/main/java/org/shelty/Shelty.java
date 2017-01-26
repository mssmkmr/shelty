package org.shelty;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Shelty extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void init() {
  }

  @Override
  public void start(Stage stage) throws Exception {
    BorderPane root;
    try {
      root = (BorderPane)FXMLLoader.load(getClass().getResource("shelty.fxml"));
      Scene scene = new Scene(root,800,600);
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
    stage.show();
  }

  @Override
  public void stop() throws Exception {
  }
}
