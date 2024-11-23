module com.example.ood_coursework {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.ood_coursework.Controllers to javafx.fxml;

    exports com.example.ood_coursework;
}
