package components;

public class Main {

    public static void main(String[] args) {

        Dialog dialog = new Dialog();

        Button loginButton = dialog.getLoginButton();
        Button exitButton = dialog.getExitButton();
        CheckBox rememberCheckBox = dialog.getRememberCheckBox();

        loginButton.click();
        exitButton.click();
        rememberCheckBox.check();
        rememberCheckBox.uncheck();
    }



}
