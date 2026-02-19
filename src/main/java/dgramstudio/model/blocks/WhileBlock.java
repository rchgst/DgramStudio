package dgramstudio.model.blocks;

import javafx.scene.control.Button;

public class WhileBlock extends CompoundBlock {

    public WhileBlock(int blockNumber, BlockType type, Button buttonEvent) {
        super(blockNumber, type);
    }

    public WhileBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }

}
