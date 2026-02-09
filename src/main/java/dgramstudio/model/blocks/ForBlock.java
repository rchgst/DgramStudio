package dgramstudio.model.blocks;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ForBlock extends CompoundBlock{

    public ForBlock(int blockNumber, BlockType type, Button buttonEvent) {
        super(blockNumber, type, buttonEvent);
    }

    public ForBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }

    @Override
    public Pane createBlock() {
        return null;
    }

    @Override
    public void drawLines(Pane pane) {

    }

    @Override
    public Pane drawBlock() {
        pane = createBlock();
        return pane;
    }
}
