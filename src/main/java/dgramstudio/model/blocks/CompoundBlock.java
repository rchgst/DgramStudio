package dgramstudio.model.blocks;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.List;

public abstract class CompoundBlock extends Block{
    private List<Block> blocks;
    protected VBox bodyBlock;
    protected Button buttonEvent;

    public CompoundBlock(int blockNumber, BlockType type, Button buttonEvent) {
        super(blockNumber, type);
        this.buttonEvent = buttonEvent;
    }

    public Block getBlock(int pos){
        return blocks.get(pos);
    }

    public void addBlock(Block block){
        blocks.add(block);
    }

    public void removeBlock(Block block){
        blocks.remove(block);
    }

    private void vBoxProperties(){
        bodyBlock.setStyle("-fx-border-color:black;");
    }

    public VBox createCompoundBlock(){
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
