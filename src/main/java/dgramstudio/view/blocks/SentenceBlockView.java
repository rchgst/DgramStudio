package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.scene.layout.Pane;

public class SentenceBlockView extends SimpleBlockView {

    public SentenceBlockView(BlockType type) {
        super( type);
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
