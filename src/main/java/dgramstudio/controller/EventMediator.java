package dgramstudio.controller;

public abstract class EventMediator{

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
