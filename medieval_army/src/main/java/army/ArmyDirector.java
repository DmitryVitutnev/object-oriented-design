package army;

import army.factories.HeavyCommonerFactory;
import army.factories.ICommonerFactory;
import army.factories.LightCommonerFactory;
import army.soldiers.Noble;

public class ArmyDirector {


    LightCommonerFactory lcFactory;
    HeavyCommonerFactory hcFactory;

    public ArmyDirector() {
        lcFactory = new LightCommonerFactory();
        hcFactory = new HeavyCommonerFactory();
    }

    public void makeFieldAssaultArmy(ArmyBuilder builder, int power) {
        if (power < 0) {
            power = 0;
        }
        makeArmy(builder, 1 * power, 7 * power, 3 * power, 2 * power, 1 * power);
    }

    public void makeFieldDefenceArmy(ArmyBuilder builder, int power) {
        if (power < 0) {
            power = 0;
        }
        makeArmy(builder, 1 * power, 4 * power, 4 * power, 2 * power, 2 * power);
    }

    public void makeSiegeAssaultArmy(ArmyBuilder builder, int power) {
        if (power < 0) {
            power = 0;
        }
        makeArmy(builder, 1 * power, 5 * power, 1 * power, 5 * power, 1 * power);
    }

    public void makeSiegeDefenceArmy(ArmyBuilder builder, int power) {
        if (power < 0) {
            power = 0;
        }
        makeArmy(builder, 1 * power, 0 * power, 4 * power, 4 * power, 4 * power);
    }

    public void makeArmy(ArmyBuilder builder, int officerNumber, int lightInfantryNumber, int archerNumber, int heavyInfantryNumber, int crossbowmanNumber) {
        builder.reset();
        for (int i = 0; i < officerNumber; i++) {
            builder.addNoble(Noble.getKing().clone());
        }
        ICommonerFactory factory;
        factory = lcFactory;
        for (int i = 0; i < lightInfantryNumber; i++) {
            builder.addCommoner(factory.createMelee());
        }
        for (int i = 0; i < archerNumber; i++) {
            builder.addCommoner(factory.createRanged());
        }
        factory = hcFactory;
        for (int i = 0; i < heavyInfantryNumber; i++) {
            builder.addCommoner(factory.createMelee());
        }
        for (int i = 0; i < crossbowmanNumber; i++) {
            builder.addCommoner(factory.createRanged());
        }
    }


}
