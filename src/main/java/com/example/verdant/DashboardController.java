package com.example.verdant;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class DashboardController {
    @FXML
    private StackPane rootStack;
    @FXML
    private AnchorPane popupLayer;

    @FXML
    private Button addTodoBtn;
    @FXML
    private void createTodoClick() throws IOException {
        Parent popup = FXMLLoader.load(getClass().getResource("NewToDo.fxml"));
        popupLayer.getChildren().setAll(popup);

        Rectangle overlay = new Rectangle(rootStack.getWidth(), rootStack.getHeight());
        overlay.setFill(Color.rgb(0,0,0,0.4));
        popupLayer.getChildren().clear();
        popupLayer.getChildren().add(overlay);
        popupLayer.getChildren().add(popup);

        if (!popupLayer.getChildren().contains(popup)) {
            popupLayer.getChildren().add(popup);
        }
    }
}
