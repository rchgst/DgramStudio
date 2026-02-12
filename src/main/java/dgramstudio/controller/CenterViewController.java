package dgramstudio.controller;

import dgramstudio.model.blocks.*;
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

    public void addBlockSelected(Block block){
        blockNumber++;
        block.setBlockNumber(blockNumber);
        containerActual.getChildren().remove(buttonEventActual);
        containerActual.getChildren().add(blockSelected(block,buttonEventActual));
        containerActual.getChildren().add(buttonEventActual);
    }

    private Node blockSelected(Block block,Button btnEvent){
        Node node = null;
        switch (block.getType()){
            case INPUT -> node = ((InputBlock)block).createBlock();
            case OUTPUT -> node = ((OutputBlock)block).createBlock();
            case SENTENCE -> node = ((SentenceBlock)block).createBlock();
            case CONDITIONAL -> {
                node = ((ConditionalBlock)block).createCompoundBlock(btnEvent);
            }
            case WHILE -> node = ((WhileBlock)block).createCompoundBlock(btnEvent);
            case FOR -> node = ((ForBlock)block).createCompoundBlock(btnEvent);
        }
        return node;
    }

}
