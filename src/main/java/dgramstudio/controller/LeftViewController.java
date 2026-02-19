package dgramstudio.controller;

import dgramstudio.view.blocks.*;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import static dgramstudio.model.blocks.BlockType.*;

public class LeftViewController extends EventMediator{

    @FXML
    private VBox SelectedBlocks;

    @FXML
    public void initialize(){
        createSelectedBlocks();
        addSelectedEvent();
    }

    private void createSelectedBlocks(){
        InputBlockView inputBlock = new InputBlockView(INPUT);
        OutputBlockView outputBlock = new OutputBlockView(OUTPUT);
        SentenceBlockView sentenceBlock = new SentenceBlockView(SENTENCE);
        ConditionalBlockView conditionalBlock = new ConditionalBlockView(CONDITIONAL);
        WhileBlockView whileBlock = new WhileBlockView(WHILE);
        ForBlockView forBlock = new ForBlockView(FOR);

        SelectedBlocks.getChildren().add(inputBlock.drawBlock());
        SelectedBlocks.getChildren().add(outputBlock.drawBlock());
        SelectedBlocks.getChildren().add(sentenceBlock.drawBlock());
        SelectedBlocks.getChildren().add(conditionalBlock.drawBlock());
        SelectedBlocks.getChildren().add(whileBlock.drawBlock());
        SelectedBlocks.getChildren().add(forBlock.drawBlock());
    }

    private void addSelectedEvent(){
        for (int i = 0; i < SelectedBlocks.getChildren().size(); i++) {
            Pane pane = (Pane) SelectedBlocks.getChildren().get(i);
            int pos = i;
            pane.setOnMouseClicked(event -> {
                selectBlockEvent(getTypeSelected(pos));
            });
        }
    }

    public void selectBlockEvent(BlockView block){
        mediator.notify(EventType.SELECTED_BLOCK,block);
    }

    private BlockView getTypeSelected(int pos){
        BlockView type = null;
        switch (pos){
            case 0->{type = new InputBlockView(INPUT);}
            case 1->{type = new OutputBlockView(OUTPUT);}
            case 2->{type = new SentenceBlockView(SENTENCE);}
            case 3->{type = new ConditionalBlockView(CONDITIONAL);}
            case 4->{type = new WhileBlockView(WHILE);}
            case 5->{type = new ForBlockView(FOR);}
        }
        return type;
    }
}
