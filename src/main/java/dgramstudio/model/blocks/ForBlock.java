package dgramstudio.model.blocks;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ForBlock extends CompoundBlock{

    public ForBlock(int blockNumber, BlockType type, Button buttonEvent) {
        super(blockNumber, type, buttonEvent);
    }

    @Override
    public Pane createBlock() {
        return null;
    }

    @Override
    public void drawLines(Pane pane) {

    }
}
