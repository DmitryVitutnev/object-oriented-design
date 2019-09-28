package ru.imit.omsu;

public class Main {

    public static void main(String[] args) {

        Radio radio = new Radio();

        Listener[] listeners = {new Listener(), new Listener(), new Listener(), new Listener(), new Listener()};


        for(Listener l : listeners) {
            radio.subscribe(l);
        }

        radio.updateInformation("Old");
        radio.sendInformation();


        radio.unsubscribe(listeners[1]);
        radio.unsubscribe(listeners[2]);

        radio.updateInformation("New");
        radio.sendInformation();


        for(Listener l : listeners) {
            System.out.println(l.getInformation());
        }



    }

}
