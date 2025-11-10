package com.example.verdant;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class DashboardController {
    @FXML
    private Label welcomeText;
    private AnchorPane mainContent;

    private void loadPage(String fxmlFile){
        try {
            AnchorPane view = FXMLLoader.load(getClass().getResource(fxmlFile));
            mainContent.getChildren().setAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void switchToDashboard() {
        loadPage("new-dashboard.fxml");
    }

    @FXML
    private void switchToLog() {
        loadPage("new-dashboard.fxml");
    }

    @FXML
    private void switchToHub() {
        loadPage("new-dashboard.fxml");
    }

    @FXML
    private void switchToProfile() {
        loadPage("new-dashboard.fxml");
    }

    @FXML
    private void switchToNewToDo() {
        loadPage("new-todo.fxml");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}