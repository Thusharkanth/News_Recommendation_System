module com.example.ood_coursework {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;

    opens com.example.ood_coursework.Controllers to javafx.fxml;

    exports com.example.ood_coursework;
}
