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

        System.out.println(imperialArmy.getMeleePower() + " " + kingdomArmy.getMeleePower());

        battle(imperialArmy, kingdomArmy, "Imperial forces", "Kingdom warriors");


    }

    private static void battle(Army attacker, Army defender, String attackerName, String defenderName) {
        double attackerMaxHealth, defenderMaxHealth, attackerHealth, defenderHealth;
        attackerMaxHealth = 3 * attacker.getTroopsNumber() + attacker.getDefence();
        defenderMaxHealth = 3 * defender.getTroopsNumber() + defender.getDefence();
        attackerHealth = attackerMaxHealth;
        defenderHealth = defenderMaxHealth;

        attackerHealth -= defender.getRangedPower();

        int time = 0;

        while (attackerHealth > 0 && defenderHealth > 0) {
            double attModifier, defModifier;
            attModifier = attackerHealth / attackerMaxHealth;
            defModifier = defenderHealth / defenderMaxHealth;

            attackerHealth -= (defender.getMeleePower() + defender.getRangedPower()) * defModifier + 1;
            defenderHealth -= (attacker.getMeleePower() + attacker.getRangedPower()) * attModifier + 1;


            time++;
        }

        System.out.println("Battle ended in " + time + " minutes");

        if (defenderHealth < attackerHealth) {
            System.out.println(attackerName + " are victorious");
        } else {
            System.out.println(defenderName + " are victorious");
        }

    }


}
