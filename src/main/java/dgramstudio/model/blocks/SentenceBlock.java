package dgramstudio.model.blocks;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class SentenceBlock extends SimpleBlock{

    public SentenceBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }

    @Override
    public Pane createBlock() {
        return pane;
    }

    @Override
    public void drawLines(Pane pane) {

    }
}
