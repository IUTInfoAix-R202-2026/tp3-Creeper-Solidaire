package fr.univ_amu.iut.exercice2;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Contrôleur de la vue {@code CompteurView.fxml}.
 *
 * <p>Concepts introduits :
 *
 * <ul>
 *   <li>Injection des composants via {@code @FXML} (les attributs portent le même nom que les
 *       {@code fx:id} du FXML)
 *   <li>Méthodes {@code @FXML} appelées par {@code onAction="#..."} dans le FXML
 *   <li>Méthode {@code initialize()} invoquée automatiquement après l'injection des composants
 *   <li>Pont avec le TP2 : le compteur est une {@link IntegerProperty} et le texte du label s'y lie
 *       via un binding
 * </ul>
 */
public class CompteurController {

  /** Le modèle : la valeur courante du compteur, observable. */
  private final IntegerProperty compteur = new SimpleIntegerProperty(0);

  @FXML private Label labelCompteur;

  @FXML private Button boutonIncrementer;

  @FXML private Button boutonDecrementer;

  @FXML private Button boutonReinitialiser;

  @FXML
  private void initialize() {
    labelCompteur.textProperty().bind(compteur.asString());
  }

  @FXML
  private void incrementer() {
    compteur.set(compteur.get() + 1);
  }

  @FXML
  private void decrementer() {
    compteur.set(compteur.get() - 1);
  }

  @FXML
  private void reinitialiser() {
    compteur.set(0);
  }

  public int getCompteur() {
    return compteur.get();
  }
}
