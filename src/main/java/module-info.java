module org.example.module2project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.module2project to javafx.fxml;
    exports org.example.module2project;
}