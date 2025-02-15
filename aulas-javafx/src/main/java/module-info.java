module br.ufrn.imd {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.ufrn.imd to javafx.fxml;
    exports br.ufrn.imd;
}
