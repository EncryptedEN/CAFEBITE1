module cafebite.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens cafebite.demo to javafx.fxml;
    exports cafebite.demo;
}