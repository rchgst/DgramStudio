package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public abstract class CycleView extends CompoundBlockView {

    public CycleView(BlockType type, Button buttonEvent) {
        super(type, buttonEvent);
    }

    public CycleView(BlockType type) {
        super(type);
    }

    @Override
    public VBox createCompoundBlock(Button buttonEvent) {
        VBox box = super.createCompoundBlock(buttonEvent);
        VBox body = new VBox();
        body.getChildren().add(cloneButton(buttonEvent));
        box.getChildren().add(body);
        return box;
    }

    @Override
    public void drawLines(Pane pane) {
        Line line1 = new Line();
        Line line2 = new Line();

        line1.startXProperty().bind(pane.widthProperty().multiply(0.2));
        line1.startYProperty().bind(pane.heightProperty());
        line1.endXProperty().bind(pane.widthProperty().multiply(0.2));
        line1.endYProperty().bind(pane.heightProperty().multiply(0.5));

        line2.startXProperty().bind(pane.widthProperty().multiply(0.2));
        line2.startYProperty().bind(pane.heightProperty().multiply(0.5));
        line2.endXProperty().bind(pane.widthProperty());
        line2.endYProperty().bind(pane.heightProperty().multiply(0.5));

        pane.getChildren().addAll(line1,line2);
    }

    @Override
    public Pane drawBlock() {
        pane = createBlock();
        drawLines(pane);
        return pane;
    }
}