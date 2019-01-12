package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.Observable;

public class Controller {
    Model model = new Model();
    @FXML
    Stage stage;
    @FXML
    Label totalLabel;
    @FXML
    TableView table;
    @FXML
    TableColumn licensenumberTableCol, makeTableCol, colorTableCol, optionsTableCol;
    @FXML
    TextField licensenumberTextField, makeTextField, colorTextField;
    @FXML
    Button addButton, editButton, deleteButton;
    @FXML
    TextArea selectedCarTextArea;
    public Car selectedCar = null;

    public void initialise() {
        setStage(stage);
//        table.setEditable(true);
        bindTableColumns();
        fillTable();
        addButton.setDisable(true);
        editButton.setDisable(true);
        deleteButton.setDisable(true);
        showTotalCars();
        getSelectedCar();
    }

    private void getSelectedCar() {
        table.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> {
            selectedCar = (Car)table.getSelectionModel().getSelectedItem();
            if(selectedCar == null){
                selectedCarTextArea.setText("");
                editButton.setDisable(true);
                deleteButton.setDisable(true);
            } else {
                selectedCarTextArea.setText(((Car) table.getSelectionModel().getSelectedItem()).toString());
                editButton.setDisable(false);
                deleteButton.setDisable(false);
            }
        });
    }


    private void showTotalCars() {
        totalLabel.setText("Total: " + model.getData().size());
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void fillTable(){
        table.setItems(model.getData());
    }

    private void bindTableColumns() {
        licensenumberTableCol.setCellValueFactory(new PropertyValueFactory<>("licensenumber"));
        makeTableCol.setCellValueFactory(new PropertyValueFactory<>("make"));
        colorTableCol.setCellValueFactory(new PropertyValueFactory<>("color"));
    }
}
