package com.example.verdant;

import com.calendarfx.view.CalendarView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class LogController {
    @FXML
    private Label welcomeText;
    private AnchorPane calendarContainer;
    private CalendarView calendarView;

    @FXML
    protected void initialize() {
        calendarView = new CalendarView();
        calendarView.showMonthPage();
        calendarView.setPrefSize(960, 600);

        calendarContainer.getChildren().add(calendarView);
        AnchorPane.setTopAnchor(calendarView, 0.0);
        AnchorPane.setLeftAnchor(calendarView, 0.0);
        AnchorPane.setBottomAnchor(calendarView, 0.0);
        AnchorPane.setRightAnchor(calendarView, 0.0);
    }
}