package dgramstudio.model.blocks;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public abstract class Block {
    private static int id;
    private final int blockNumber;
    private String text;
    private BlockType type;
    protected Pane pane;
    protected Label label;

    protected Block(int blockNumber,BlockType type) {
        this.blockNumber = blockNumber;
        this.type = type;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BlockType getType() {
        return type;

    }

    private void paneProperties(){
        pane = new Pane();
        pane.setPrefSize(200,50);
        pane.setStyle("-fx-border-color : black;");
    }

    private void labelProperties(){
        label = new Label("hola");
        label.setPrefSize(pane.getPrefWidth(),pane.getPrefHeight());
        label.setAlignment(Pos.CENTER);
    }

    public Pane createBlock() {
        paneProperties();
        labelProperties();
        pane.getChildren().add(label);
        return pane;
    }

    public abstract void drawLines(Pane pane);
}
