package components;

public class CheckBox extends Component {

    public CheckBox(IMediator mediator) {
        super(mediator);
    }

    public void check() {
        mediator.notify(this, Event.CHECK);
    }

    public void uncheck() {
        mediator.notify(this, Event.UNCHECK);
    }

}
