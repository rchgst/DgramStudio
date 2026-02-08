package dgramstudio.model.blocks;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public abstract class SimpleBlock extends Block{

    public SimpleBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }
}
