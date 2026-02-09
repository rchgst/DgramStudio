package dgramstudio.model.blocks;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class InputBlock extends SimpleBlock{

    public InputBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }

    @Override
    public Pane createBlock() {
        pane = super.createBlock();
        drawLines(pane);
        return pane;
    }

    @Override
    public void drawLines(Pane pane) {
        Line line = new Line();
        line.startXProperty().bind(pane.heightProperty().multiply(0));
        line.startYProperty().bind(pane.heightProperty().multiply(0.5));
        line.endXProperty().bind(pane.widthProperty().multiply(0.25));
        line.endYProperty().bind(pane.heightProperty().multiply(0));

        pane.getChildren().add(line);
    }

    @Override
    public Pane drawBlock() {
        pane = createBlock();
        label.setText("entrada");
        return pane;
    }
}
