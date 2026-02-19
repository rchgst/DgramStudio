package dgramstudio.controller;

import dgramstudio.model.blocks.*;
import dgramstudio.view.blocks.BlockView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class HelloController implements Mediator{
    @FXML private TopViewController topViewController;
    @FXML private LeftViewController leftViewController;
    @FXML private CenterViewController centerViewController;
    private BlockView blockSelected;

    @FXML
    private VBox Body;

    @FXML
    private Button btnEvent;

    @FXML
    public void initialize(){
        topViewController.setMediator(this);
        leftViewController.setMediator(this);
        centerViewController.setMediator(this);
    }

    @Override
    public void notify(EventType event, Object data) {

        switch (event){
            case SELECTED_BLOCK -> {blockSelected = (BlockView) data;}
            case ADD_BLOCK -> {
                centerViewController.addBlockSelected(blockSelected);
            }
        }

    }
}
