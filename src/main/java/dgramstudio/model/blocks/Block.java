package dgramstudio.model.blocks;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public abstract class Block {
    private static int id;
    private int blockNumber;
    private String text;
    private BlockType type;

    protected Block(int blockNumber,BlockType type) {
        this.blockNumber = blockNumber;
        this.type = type;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(int blockNumber){this.blockNumber = blockNumber;}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BlockType getType() {
        return type;
    }
}
