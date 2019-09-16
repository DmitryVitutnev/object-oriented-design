package components;

public abstract class Component {

    protected IMediator mediator;

    public Component(IMediator mediator) {
        this.mediator = mediator;
    }

    public void click() {
        mediator.notify(this, Event.CLICK);
    }



}
