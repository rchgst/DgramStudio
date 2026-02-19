package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class OutputBlockView extends SimpleBlockView {

    public OutputBlockView(BlockType type) {
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
        Line left,right;
        left = new Line();
        right = new Line();

        left.startXProperty().bind(pane.heightProperty().multiply(0));
        left.startYProperty().bind(pane.heightProperty().multiply(0.5));
        left.endXProperty().bind(pane.widthProperty().multiply(0.25));
        left.endYProperty().bind(pane.heightProperty());

        right.startXProperty().bind(pane.widthProperty());
        right.startYProperty().bind(pane.heightProperty().multiply(0.5));
        right.endXProperty().bind(pane.widthProperty().multiply(0.75));
        right.endYProperty().bind(pane.heightProperty());

        pane.getChildren().addAll(left,right);
    }

    @Override
    public Pane drawBlock() {
        pane = createBlock();
        label.setText("salida");
        return pane;
    }
}
