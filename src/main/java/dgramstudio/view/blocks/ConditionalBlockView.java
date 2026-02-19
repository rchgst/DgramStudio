package dgramstudio.view.blocks;

import dgramstudio.model.blocks.BlockType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public class ConditionalBlockView extends CompoundBlockView {

    public ConditionalBlockView(BlockType type, Button buttonEvent) {
        super( type,buttonEvent);
    }

    public ConditionalBlockView(BlockType type) {
        super( type);
    }

    @Override
    public VBox createCompoundBlock(Button buttonEvent) {
        VBox vBox = super.createCompoundBlock(buttonEvent);
        drawLines(pane);
        HBox body = new HBox();
        VBox trueBox = new VBox();
        VBox falseBox = new VBox();

        Button b1 = cloneButton(buttonEvent);
        Button b2 = cloneButton(buttonEvent);

        trueBox.getChildren().add(b1);
        falseBox.getChildren().add(b2);

        body.getChildren().addAll(trueBox,falseBox);

        vBox.getChildren().add(body);

        return vBox;
    }

    @Override
    public void drawLines(Pane pane) {
        Line left = new Line();
        Line right = new Line();

        left.startXProperty().bind(pane.heightProperty().multiply(0));
        left.startYProperty().bind(pane.heightProperty().multiply(0.5));
        left.endXProperty().bind(pane.widthProperty().multiply(0.5));
        left.endYProperty().bind(pane.heightProperty());

        right.startXProperty().bind(pane.widthProperty());
        right.startYProperty().bind(pane.heightProperty().multiply(0.5));
        right.endXProperty().bind(pane.widthProperty().multiply(0.5));
        right.endYProperty().bind(pane.heightProperty());

        pane.getChildren().addAll(left,right);
    }

    @Override
    public Pane drawBlock() {
        pane = createBlock();
        label.setText("alternativa");
        drawLines(pane);
        return pane;
    }
}
