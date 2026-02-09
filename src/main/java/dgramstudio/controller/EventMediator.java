package dgramstudio.controller;

public abstract class EventMediator{

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
