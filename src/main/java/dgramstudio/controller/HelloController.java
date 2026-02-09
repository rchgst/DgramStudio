package dgramstudio.controller;

import dgramstudio.model.blocks.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class HelloController implements Mediator{
    @FXML private TopViewController topViewController;
    @FXML private LeftViewController leftViewController;
    @FXML private CenterViewController centerViewController;

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
            case ADD_BLOCK -> System.out.println();
        }

    }
}
