package com.example.verdant;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class PopupTodo {
    @FXML private TextField nameField, typeField, breedField, ageField;

    @FXML
    private void handleAddTodo(ActionEvent event) {

        String name = nameField.getText();
        String type = typeField.getText();
        String breed = breedField.getText();
        String age = ageField.getText();

    }
}

