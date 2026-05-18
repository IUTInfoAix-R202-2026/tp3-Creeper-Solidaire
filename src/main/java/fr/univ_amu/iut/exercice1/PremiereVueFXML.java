package fr.univ_amu.iut.exercice1;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PremiereVueFXML extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    URL url = getClass().getResource("PremiereVueFXML.fxml");

    Parent root = FXMLLoader.load(url);

    Scene scene = new Scene(root);

    primaryStage.setScene(scene);
    primaryStage.setTitle("Première vue FXML");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
