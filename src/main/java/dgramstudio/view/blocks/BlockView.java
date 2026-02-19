package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public abstract class BlockView {
    private String text;
    private BlockType type;
    protected Pane pane;
    protected Label label;

    protected BlockView(BlockType type) {
        this.type = type;
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
        label.setAlignment(Pos.TOP_CENTER);
    }

    public Pane createBlock() {
        paneProperties();
        labelProperties();
        pane.getChildren().add(label);
        return pane;
    }

    public abstract void drawLines(Pane pane);
    public abstract Pane drawBlock();
}
