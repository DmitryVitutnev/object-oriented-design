package factories;

import soldiers.Commoner;

public class LightCommonerFactory implements ICommonerFactory {
    @Override
    public Commoner createMelee() {
        int meleePower = 3;
        int rangedPower = 0;
        int defence = 3;

        return new Commoner(meleePower, rangedPower, defence);
    }

    @Override
    public Commoner createRanged() {
        int meleePower = 1;
        int rangedPower = 3;
        int defence = 2;

        return new Commoner(meleePower, rangedPower, defence);
    }
}
