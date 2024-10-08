module com.example.menudeclasses {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.menudeclasses to javafx.fxml;
    exports com.example.menudeclasses;
}