package components;

public class Dialog implements IMediator {

    private Button loginButton;
    private Button exitButton;
    private CheckBox rememberCheckBox;

    public Dialog() {
        loginButton = new Button(this);
        exitButton = new Button(this);
        rememberCheckBox = new CheckBox(this);
    }

    public void notify(Component sender, Event event) {
        if(sender == loginButton && event == Event.CLICK) {
            System.out.println("Login");
        }
        if(sender == exitButton && event == Event.CLICK) {
            System.out.println("Exit");
        }
        if(sender == rememberCheckBox && event == Event.CHECK) {
            System.out.println("Remember login");
        }
        if(sender == rememberCheckBox && event == Event.UNCHECK) {
            System.out.println("Do not remember login");
        }

    }

    public Button getLoginButton() {
        return loginButton;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public CheckBox getRememberCheckBox() {
        return rememberCheckBox;
    }
}
