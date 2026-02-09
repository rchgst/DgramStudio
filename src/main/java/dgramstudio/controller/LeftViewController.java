package dgramstudio.controller;

import dgramstudio.model.blocks.*;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import static dgramstudio.model.blocks.BlockType.*;

public class LeftViewController extends EventMediator{

    @FXML
    private VBox SelectedBlocks;

    @FXML
    public void initialize(){
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

}
