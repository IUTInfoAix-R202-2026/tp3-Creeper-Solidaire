package fr.univ_amu.iut.exercice4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CoquilleAccueilController {

  @FXML private Label labelTitre;

  @FXML private Label labelStatut;

  @FXML
  private void onMesSites() {
    labelTitre.setText("Mes sites de suivi");
    labelStatut.setText("Rubrique active : Mes sites");
  }

  @FXML
  private void onImporter() {
    labelTitre.setText("Importer une nuit");
    labelStatut.setText("Rubrique active : Importer une nuit");
  }

  @FXML
  private void onVueTabulaire() {
    labelTitre.setText("Vue tabulaire des passages");
    labelStatut.setText("Rubrique active : Vue tabulaire");
  }

  @FXML
  private void onParametres() {
    labelTitre.setText("Paramètres de l'application");
    labelStatut.setText("Rubrique active : Paramètres");
  }

  @FXML
  private void onQuitter() {
    Stage stage = (Stage) labelTitre.getScene().getWindow();
    stage.hide();
  }
}
