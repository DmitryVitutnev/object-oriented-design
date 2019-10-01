package ru.omsu.imit;

public class Main {

    public static void main(String[] args) {

        AudioController controller = new AudioController();


        controller.getSaveButton().click();
        controller.getPlayButton().click();
        controller.getLockButton().click();
        controller.getPlayButton().click();

        controller.getLoadButton().click();
        controller.getPlayButton().click();


    }



}
