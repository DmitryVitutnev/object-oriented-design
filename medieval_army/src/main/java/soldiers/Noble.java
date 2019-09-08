package soldiers;

import java.util.ArrayList;
import java.util.List;

public class Noble implements ISoldier, Prototype<Noble> {

    private static Noble king;

    private int meleePower;
    private int rangedPower;
    private int defence;

    private List<ISoldier> troops;

    private Noble(int meleePower, int rangedPower, int defence) {
        this.meleePower = meleePower;
        this.rangedPower = rangedPower;
        this.defence = defence;
        troops = new ArrayList<>();
    }

    public static Noble getKing() {
        if (king == null) {
            int mP = 1 + (int) (Math.random() * 5);
            int rP = 1 + (int) (Math.random() * 5);
            int def = 1 + (int) (Math.random() * 5);
            king = new Noble(mP, rP, def);
        }
        return king;
    }

    public static void changeKing() {
        king = null;
    }

    public void addTroop(ISoldier t) {
        troops.add(t);
    }

    @Override
    public int getMeleePower() {
        int result = meleePower;
        for (ISoldier s : troops) {
            result += s.getMeleePower();
        }
        return result;
    }

    @Override
    public int getRangedPower() {
        int result = rangedPower;
        for (ISoldier s : troops) {
            result += s.getRangedPower();
        }
        return result;
    }

    @Override
    public int getDefence() {
        int result = defence;
        for (ISoldier s : troops) {
            result += s.getDefence();
        }
        return result;
    }

    @Override
    public Noble clone() {
        int mP = 1 + (int) (Math.random() * (getKing().meleePower - 1));
        int rP = 1 + (int) (Math.random() * (getKing().rangedPower - 1));
        int def = 1 + (int) (Math.random() * (getKing().defence - 1));

        return new Noble(mP, rP, def);
    }

}
