package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ForBlockView extends CycleView{
    private String initialVariable = "i";
    private String stepVariable = "(1)";
    private String finalVariable = "N";

    public ForBlockView(BlockType type, Button buttonEvent) {
        super(type, buttonEvent);
    }

    public ForBlockView( BlockType type) {
        super(type);
    }

    @Override
    public Pane drawBlock() {
        pane = super.drawBlock();
        label.setText(initialVariable+" .. "+stepVariable+" .. "+finalVariable);
        return pane;
    }
}
