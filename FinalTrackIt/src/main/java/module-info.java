module com.example.finaltrackit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.finaltrackit to javafx.fxml;
    exports com.example.finaltrackit;
}