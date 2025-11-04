package com.example.verdant;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NewToDoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}