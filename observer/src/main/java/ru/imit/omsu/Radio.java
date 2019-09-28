package ru.imit.omsu;

import java.util.HashSet;
import java.util.Set;

public class Radio {

    private Set<Listener> subs;
    private String info;

    public Radio() {
        info = "";
        subs = new HashSet<Listener>();
    }

    public void subscribe(Listener l) {
        subs.add(l);
    }

    public void unsubscribe(Listener l) {
        subs.remove(l);
    }

    public void sendInformation() {
        for(Listener l : subs) {
            l.setInformation(info);
        }
    }

    public void updateInformation(String info) {
        this.info = info;
    }

}
