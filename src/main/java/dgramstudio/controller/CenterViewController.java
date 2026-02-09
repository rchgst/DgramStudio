package dgramstudio.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class CenterViewController extends EventMediator{

    @FXML
    private VBox Body;

    @FXML
    private Button btnEvent;

    @FXML
    void addBlock(ActionEvent event) {
        Button buttonEvent = (Button) event.getSource();
        VBox containerActual = (VBox) buttonEvent.getParent();
        containerActual.getChildren().remove(btnEvent);

        containerActual.getChildren().add(btnEvent);
    }

}
