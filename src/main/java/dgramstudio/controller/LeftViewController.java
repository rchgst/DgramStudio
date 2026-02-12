package dgramstudio.controller;

import dgramstudio.model.blocks.*;
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
        InputBlock inputBlock = new InputBlock(0,INPUT);
        OutputBlock outputBlock = new OutputBlock(1,OUTPUT);
        SentenceBlock sentenceBlock = new SentenceBlock(2,SENTENCE);
        ConditionalBlock conditionalBlock = new ConditionalBlock(3,CONDITIONAL);
        WhileBlock whileBlock = new WhileBlock(4,WHILE);
        ForBlock forBlock = new ForBlock(5,FOR);

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

    public void selectBlockEvent(Block block){
        mediator.notify(EventType.SELECTED_BLOCK,block);
    }

    private Block getTypeSelected(int pos){
        Block type = null;
        switch (pos){
            case 0->{type = new InputBlock(0,INPUT);}
            case 1->{type = new OutputBlock(0,OUTPUT);}
            case 2->{type = new SentenceBlock(0,SENTENCE);}
            case 3->{type = new ConditionalBlock(0,CONDITIONAL);}
            case 4->{type = new WhileBlock(0,WHILE);}
            case 5->{type = new ForBlock(0,FOR);}
        }
        return type;
    }
}
