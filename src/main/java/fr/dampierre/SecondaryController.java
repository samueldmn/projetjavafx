package fr.dampierre;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.time.format.TextStyle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private Label textcoucou;

    @FXML
    private Button secondaryButton;
    @FXML
    private Button textcolor;

    /**
     * @param event
     */
    @FXML
    void COUCOU(ActionEvent event) {
        textcoucou.setText("COUCOU !");
        textcolor.setStyle("-fx-text-fill:red");
    }

}