package dgramstudio.controller;

import dgramstudio.model.blocks.*;
import dgramstudio.view.blocks.BlockView;
import dgramstudio.view.blocks.CompoundBlockView;
import dgramstudio.view.blocks.SimpleBlockView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class CenterViewController extends EventMediator{
    private Button buttonEventActual;
    private VBox containerActual;
    private int blockNumber = 0;

    @FXML
    private VBox Body;

    @FXML
    private Button btnEvent;

    @FXML
    void addBlock(ActionEvent event) {
        buttonEventActual = (Button) event.getSource();
        containerActual = (VBox) buttonEventActual.getParent();
        mediator.notify(EventType.ADD_BLOCK,buttonEventActual);
    }

    public void addBlockSelected(BlockView block){
        containerActual.getChildren().remove(buttonEventActual);
        containerActual.getChildren().add(blockSelected(block,buttonEventActual));
        containerActual.getChildren().add(buttonEventActual);
    }

    private Node blockSelected(BlockView block, Button btnEvent){
        Node node = block instanceof CompoundBlockView ? ((CompoundBlockView)block).createCompoundBlock(btnEvent):((SimpleBlockView)block).createBlock();
        return node;
    }

}
