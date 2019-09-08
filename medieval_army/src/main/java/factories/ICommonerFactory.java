package factories;

import soldiers.Commoner;

public interface ICommonerFactory {

    Commoner createMelee();

    Commoner createRanged();

}
