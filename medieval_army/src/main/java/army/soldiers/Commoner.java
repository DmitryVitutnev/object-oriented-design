package army.soldiers;

public class Commoner implements ISoldier {

    private int meleePower;
    private int rangedPower;
    private int defence;

    public Commoner(int meleePower, int rangedPower, int defence) {
        this.meleePower = meleePower;
        this.rangedPower = rangedPower;
        this.defence = defence;
    }

    @Override
    public int getMeleePower() {
        return meleePower;
    }

    @Override
    public int getRangedPower() {
        return rangedPower;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public int getTroopsNumber() {
        return 1;
    }
}
