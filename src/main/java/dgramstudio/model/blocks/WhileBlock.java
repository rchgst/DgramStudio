package dgramstudio.model.blocks;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public class WhileBlock extends Cycle {

    public WhileBlock(int blockNumber, BlockType type, Button buttonEvent) {
        super(blockNumber, type, buttonEvent);
    }

    public WhileBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }

    public Pane drawBlock(){
        pane = super.drawBlock();
        label.setText("ciclo condicionado");
        return pane;
    }
}
