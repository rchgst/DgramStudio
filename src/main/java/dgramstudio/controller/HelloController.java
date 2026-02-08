package dgramstudio.controller;

import dgramstudio.model.blocks.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class HelloController {

    @FXML
    private VBox Body;

    @FXML
    private Button btnEvent;

    @FXML
    void addBlock(ActionEvent event) {
        Button buttonEvent = (Button) event.getSource();
        VBox containerActual = (VBox) buttonEvent.getParent();
        containerActual.getChildren().remove(btnEvent);
        WhileBlock block = new WhileBlock(1, BlockType.SENTENCE,btnEvent);
        containerActual.getChildren().add(block.createCompoundBlock());
        containerActual.getChildren().add(btnEvent);
    }

}
