package army;

import army.soldiers.Noble;

public class Army {

    private Noble commander;

    public Army(Noble commander) {
        this.commander = commander;
    }

    public int getMeleePower() {
        return commander.getMeleePower();
    }

    public int getRangedPower() {
        return commander.getRangedPower();
    }

    public int getDefence() {
        return commander.getDefence();
    }

    public int getTroopsNumber() {
        return commander.getTroopsNumber();
    }

}
