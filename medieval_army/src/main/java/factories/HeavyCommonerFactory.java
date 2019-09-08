package factories;

import soldiers.Commoner;

public class HeavyCommonerFactory implements ICommonerFactory {
    @Override
    public Commoner createMelee() {
        int meleePower = 5;
        int rangedPower = 0;
        int defence = 5;

        return new Commoner(meleePower, rangedPower, defence);
    }

    @Override
    public Commoner createRanged() {
        int meleePower = 2;
        int rangedPower = 5;
        int defence = 3;

        return new Commoner(meleePower, rangedPower, defence);
    }
}
