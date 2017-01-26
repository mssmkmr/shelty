package org.shelty.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 * Shelty Controller.
 */
public class SheltyController implements Initializable {

  @FXML
  private BorderPane pane;
  @FXML
  private Canvas canvas;
  @FXML
  private TextField textfield;

  @Override
  public void initialize(URL location, ResourceBundle resources)
  {
    textfield.setOnKeyPressed(new EventHandler<KeyEvent>() {
      @Override
      public void handle(KeyEvent keyEvent)
      {
    	    System.out.println(keyEvent.getCode());
          textfield.setText("");
      }
    });
    GraphicsContext gc = canvas.getGraphicsContext2D();
    drawCards(gc);
  }

  /**
   * Handle action related to "About" menu item.
   *
   * @param event Event on "About" menu item.
   */
  @FXML
  private void handleAboutAction(final ActionEvent event)
  {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("About");
    alert.setHeaderText("Shelty");
    alert.setContentText("Shelty is a Cognitive Remediation Training Software.\n\n" +
                          "Version: 0.0.0\n" +
                          "Date: xxxx.xx.xx");
    alert.showAndWait();
  }

  private void drawCards(GraphicsContext gc) {
    gc.setStroke(Color.BLACK);
    gc.setLineWidth(1);
    drawCard1(gc);
    drawCard2(gc);
    drawCard3(gc);
    drawCard4(gc);
    drawCard5(gc);
  }

  private void drawCard1(GraphicsContext gc) {
    gc.strokeRoundRect(50, 50, 160, 200, 20, 20);
    gc.setFill(Color.RED);
    gc.fillOval(100, 120, 60, 60);
    gc.strokeText("1", 120, 280);
  }
  private void drawCard2(GraphicsContext gc) {
    gc.strokeRoundRect(250, 50, 160, 200, 20, 20);
    gc.setFill(Color.BLUE);
    gc.fillRect(270, 60, 60, 60);
    gc.fillRect(340, 160, 60, 60);
    gc.strokeText("2", 320, 280);
  }
  private void drawCard3(GraphicsContext gc) {
    gc.strokeRoundRect(450, 50, 160, 200, 20, 20);
    gc.setFill(Color.GREEN);
    gc.fillPolygon(new double[]{500, 530, 560}, new double[]{110, 60, 110}, 3);
    gc.fillPolygon(new double[]{460, 490, 520}, new double[]{230, 180, 230}, 3);
    gc.fillPolygon(new double[]{540, 570, 600}, new double[]{230, 180, 230}, 3);
    gc.strokeText("3", 530, 280);
  }
  private void drawCard4(GraphicsContext gc) {
    gc.strokeRoundRect(650, 50, 160, 200, 20, 20);
    gc.setFill(Color.MAGENTA);
    gc.fillPolygon(new double[]{660, 685, 710, 700, 670}, new double[]{75, 60, 75, 110, 110}, 5);
    gc.fillPolygon(new double[]{740, 765, 790, 780, 750}, new double[]{75, 60, 75, 110, 110}, 5);
    gc.fillPolygon(new double[]{660, 685, 710, 700, 670}, new double[]{175, 160, 175, 210, 210}, 5);
    gc.fillPolygon(new double[]{740, 765, 790, 780, 750}, new double[]{175, 160, 175, 210, 210}, 5);
    gc.strokeText("4", 740, 280);
  }
  private void drawCard5(GraphicsContext gc) {
    gc.strokeRoundRect(350, 350, 160, 200, 20, 20);
    gc.setFill(Color.GREEN);
    gc.fillPolygon(new double[]{400, 425, 450, 440, 410}, new double[]{425, 410, 425, 460, 460}, 5);
    gc.strokeText("4", 740, 280);
  }
}
