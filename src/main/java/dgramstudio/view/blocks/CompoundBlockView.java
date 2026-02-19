package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.List;

public abstract class CompoundBlockView extends BlockView{
    protected VBox bodyBlock;
    protected Button buttonEvent;

    public CompoundBlockView(BlockType type, Button buttonEvent) {
        super(type);
        this.buttonEvent = buttonEvent;
    }

    public CompoundBlockView(BlockType type){
        super(type);
    }

    private void vBoxProperties(){
        bodyBlock.setStyle("-fx-border-color:black;");
    }

    public VBox createCompoundBlock(Button buttonEvent){
        VBox bodyBlock = new VBox();
        pane = createBlock();
        bodyBlock.getChildren().add(pane);
        return bodyBlock;
    }

    protected Button cloneButton(Button oldButton) {
        Button newButton = new Button();
        newButton.setText(oldButton.getText());
        newButton.setOnAction(oldButton.getOnAction());

        newButton.setStyle(oldButton.getStyle());
        newButton.getStyleClass().addAll(oldButton.getStyleClass());

        newButton.setMinSize(oldButton.getMinWidth(), oldButton.getMinHeight());
        newButton.setPrefSize(oldButton.getPrefWidth(), oldButton.getPrefHeight());
        newButton.setMaxSize(oldButton.getMaxWidth(), oldButton.getMaxHeight());

        newButton.setFont(oldButton.getFont());

        return newButton;
    }
}
