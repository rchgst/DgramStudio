package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class WhileBlockView extends CycleView {

    public WhileBlockView(BlockType type, Button buttonEvent) {
        super(type, buttonEvent);
    }

    public WhileBlockView(BlockType type) {
        super( type);
    }

    public Pane drawBlock(){
        pane = super.drawBlock();
        label.setText("ciclo condicionado");
        return pane;
    }
}
