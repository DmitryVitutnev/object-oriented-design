package army.factories;

import army.soldiers.Commoner;

public interface ICommonerFactory {

    Commoner createMelee();

    Commoner createRanged();

}
