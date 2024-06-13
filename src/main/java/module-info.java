module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires commons.csv;
    requires com.opencsv;
    requires java.sql;
    requires com.google.gson;
    requires org.json;

    opens vehicle.data to com.google.gson;



    opens com.example.javaFx to javafx.fxml;
    exports com.example.javaFx;
}