package soldiers;

import java.util.ArrayList;
import java.util.List;

public class Noble implements ISoldier {

    private int meleePower;
    private int rangedPower;
    private int defence;

    private List<ISoldier> troops;

    public Noble(int meleePower, int rangedPower, int defence) {
        this.meleePower = meleePower;
        this.rangedPower = rangedPower;
        this.defence = defence;
        troops = new ArrayList<>();
    }

    public void addTroop(ISoldier t) {
        troops.add(t);
    }

    @Override
    public int getMeleePower() {
        int result = meleePower;
        for(ISoldier s : troops) {
            result += s.getMeleePower();
        }
        return result;
    }

    @Override
    public int getRangedPower() {
        int result = rangedPower;
        for(ISoldier s : troops) {
            result += s.getRangedPower();
        }
        return result;
    }

    @Override
    public int getDefence() {
        int result = defence;
        for(ISoldier s : troops) {
            result += s.getDefence();
        }
        return result;
    }
}
