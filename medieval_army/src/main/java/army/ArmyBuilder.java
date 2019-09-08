package army;

import soldiers.Commoner;
import soldiers.Noble;

import java.util.ArrayList;
import java.util.List;

public class ArmyBuilder {

    private List<Noble> nobles;
    private Noble commander;

    public ArmyBuilder() {
        reset();
    }

    public void reset() {
        commander = Noble.getKing().clone();
        nobles = new ArrayList<>();
        nobles.add(commander);
    }

    public void addNoble(Noble noble) {
        int i = (int) (Math.random() * nobles.size());
        nobles.get(i).addTroop(noble);
        nobles.add(noble);
    }

    public void addCommoner(Commoner commoner) {
        int i = (int) (Math.random() * nobles.size());
        nobles.get(i).addTroop(commoner);
    }

    public Army getResult() {
        return new Army(commander);
    }



}
