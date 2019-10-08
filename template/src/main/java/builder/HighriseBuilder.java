package builder;

import house.Foundation;
import house.House;
import house.Roof;

public class HighriseBuilder extends HouseBuilder {

    @Override
    public void layFoundation(House h) {
        h.setFoundation(Foundation.SOLID);
    }

    @Override
    public void addFloors(House h) {
        h.setFloors(30);
    }

    @Override
    public void placeDoors(House h) {
        h.setDoors(5);
    }

    @Override
    public void addWindows(House h) {
        h.setWindows((h.getFloors() - 1) * h.getDoors());
    }

    @Override
    public void placeRoof(House h) {
        h.setRoof(Roof.FLAT);
    }

}
