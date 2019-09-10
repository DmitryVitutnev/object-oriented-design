package army;

public class Main {


    public static void main(String[] args) {

        ArmyBuilder armyBuilder = new ArmyBuilder();
        ArmyDirector armyDirector = new ArmyDirector();

        Army imperialArmy, kingdomArmy;

        armyDirector.makeFieldAssaultArmy(armyBuilder, 6);
        imperialArmy = armyBuilder.getResult();

        armyDirector.makeFieldDefenceArmy(armyBuilder, 5);
        kingdomArmy = armyBuilder.getResult();

        


    }

    public static void battle(Army attacker, Army defender) {


    }





}
