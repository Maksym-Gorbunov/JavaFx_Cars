package app;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller {
    Model model = new Model();
    @FXML
    Stage stage;
    @FXML
    Label headerLabel;
    @FXML
    TableView table;
    @FXML
    TableColumn licensenumberTableCol, makeTableCol, colorTableCol, optionsTableCol;
    @FXML
    TextField licensenumberTextField, makeTextField, colorTextField;
    @FXML
    Button addButton, editButton, deleteButton;

    public void initialise() {
        setStage(stage);
//        table.setEditable(true);
        bindTableColumns();
        fillTable();
        addButton.setDisable(true);
        editButton.setDisable(true);
        deleteButton.setDisable(true);
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
