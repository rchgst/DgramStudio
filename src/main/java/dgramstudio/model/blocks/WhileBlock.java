package dgramstudio.model.blocks;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class WhileBlock extends CompoundBlock{

    public WhileBlock(int blockNumber, BlockType type, Button buttonEvent) {
        super(blockNumber, type, buttonEvent);
    }

    @Override
    public VBox createCompoundBlock() {
        VBox box = super.createCompoundBlock();
        VBox body = new VBox();
        body.getChildren().add(cloneButton(buttonEvent));
        box.getChildren().add(body);
        return box;
    }

    @Override
    public void drawLines(Pane pane) {}
}
