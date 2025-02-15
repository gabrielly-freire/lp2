module br.imd {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.imd to javafx.fxml;
    exports br.imd;

    opens br.imd.controller to javafx.fxml;
    exports br.imd.controller;
}
