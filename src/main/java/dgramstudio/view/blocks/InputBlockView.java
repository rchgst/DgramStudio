package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class InputBlockView extends SimpleBlockView {

    public InputBlockView(BlockType type) {
        super(type);
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
