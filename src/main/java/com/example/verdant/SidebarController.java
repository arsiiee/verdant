package com.example.verdant;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class SidebarController {
    @FXML
    private StackPane contentPane;

    @FXML
    private Button dashbtn;
    private Node page;

    @FXML
    private void handleDashboardClick() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("DashboardPage.fxml"));
        contentPane.getChildren().setAll(page);
    }

    @FXML
    private Button logbtn;

    @FXML
    private void handleLogClick() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("LogPage.fxml"));
        contentPane.getChildren().setAll(page);
    }

    @FXML
    private Button hubbtn;

    @FXML
    private void handleHubClick() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("HubPage.fxml"));
        contentPane.getChildren().setAll(page);
    }

    @FXML
    private Button userbtn;

    @FXML
    private void handleUserClick() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
        contentPane.getChildren().setAll(page);
    }
}