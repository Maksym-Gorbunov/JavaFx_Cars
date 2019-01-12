package app;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller {
    Model model = new Model();
    @FXML
    Stage stage;


    public void initialise() {
        setStage(stage);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
