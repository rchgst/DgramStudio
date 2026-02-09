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
        //SelectedBlocks.getChildren().add(forBlock.createBlock());
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

    public void selectBlockEvent(BlockType blockType){
        System.out.println(blockType);
    }

    private BlockType getTypeSelected(int pos){
        BlockType type = null;
        switch (pos){
            case 0->{type = INPUT;}
            case 1->{type = OUTPUT;}
            case 2->{type = SENTENCE;}
            case 3->{type = CONDITIONAL;}
            case 4->{type = WHILE;}
            case 5->{type = FOR;}
        }
        return type;
    }
}
