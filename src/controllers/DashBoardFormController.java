package controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

public class DashBoardFormController {
    public ComboBox cmbTemType1;
    public ComboBox cmbTemType2;
    public JFXTextField txtTem;
    public JFXTextField txtTem2;
    public void initialize () {
        cmbTemType1.getItems().add("Celcius");
        cmbTemType1.getItems().add("Farenhite");
        cmbTemType1.getItems().add("Kelvin");


        cmbTemType2.getItems().add("Celcius");
        cmbTemType2.getItems().add("Farenhite");
        cmbTemType2.getItems().add("Kelvin");

    }
    public void btnTemConvertOnAction(ActionEvent actionEvent) {

    }
}
