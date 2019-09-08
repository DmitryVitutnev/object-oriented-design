package army;

import factories.HeavyCommonerFactory;
import factories.ICommonerFactory;
import factories.LightCommonerFactory;
import soldiers.Commoner;
import soldiers.Noble;

public class ArmyDirector {


    LightCommonerFactory lcFactory;
    HeavyCommonerFactory hcFactory;

    public ArmyDirector() {
        lcFactory = new LightCommonerFactory();
        hcFactory = new HeavyCommonerFactory();
    }

    public void makeArmy(ArmyBuilder builder, int nobleNumber, int commonerNumber) {
        builder.reset();
        for (int i = 0; i < nobleNumber; i++) {
            builder.addNoble(Noble.getKing().clone());
        }
        ICommonerFactory factory;
        Commoner c;
        for (int i = 0; i < commonerNumber; i++) {
            if (3 * Math.random() < 1) {
                factory = hcFactory;
            } else {
                factory = lcFactory;
            }
            if (2 * Math.random() < 1) {
                c = factory.createMelee();
            } else {
                c = factory.createRanged();
            }
            builder.addCommoner(c);
        }
    }


}
