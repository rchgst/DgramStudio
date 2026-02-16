package dgramstudio.model.blocks;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class SentenceBlock extends SimpleBlock{

    public SentenceBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }

    @Override
    public Pane createBlock() {
        pane = super.createBlock();
        return pane;
    }

    @Override
    public void drawLines(Pane pane) {}

    @Override
    public Pane drawBlock() {
        pane = super.createBlock();
        label.setText("asignación");
        return pane;
    }
}
