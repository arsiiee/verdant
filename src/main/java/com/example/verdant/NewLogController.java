package com.example.verdant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class NewLogController {
    private LogPageController parent;
    public void setParent(LogPageController parent) {
        this.parent = parent;
    }

    @FXML
    private Button createLogBtn;
    @FXML
    private void createLogClick() {
        System.out.println("Creating Log.");
    }
    @FXML
    private Button cancelLogBtn;
    @FXML
    private void cancelLog() {
        if (parent != null) {
            parent.closePopup();
        }
    }

    @FXML
    private Button createPlanBtn;
    @FXML
    private void createPlanClick() {
        System.out.println("Creating Plan.");
    }
}
