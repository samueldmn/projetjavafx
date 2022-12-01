package fr.dampierre;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private Label COUCOU;

    @FXML
    private Button secondaryButton;


    @FXML
    void COUCOU(ActionEvent event) {

    }
}