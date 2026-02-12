package dgramstudio.model.blocks;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ForBlock extends Cycle{
    private String initialVariable = "i";
    private String stepVariable = "(1)";
    private String finalVariable = "N";

    public ForBlock(int blockNumber, BlockType type, Button buttonEvent) {
        super(blockNumber, type, buttonEvent);
    }

    public ForBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }

    @Override
    public Pane drawBlock() {
        pane = super.drawBlock();
        label.setText(initialVariable+" .. "+stepVariable+" .. "+finalVariable);
        return pane;
    }
}
