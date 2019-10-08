package builder;

import house.Foundation;
import house.House;
import house.Roof;

public class CottageBuilder extends HouseBuilder {



    @Override
    public void placeWalls(House h) {
        h.setWalls(6);
    }

    @Override
    public void addFloors(House h) {
        h.setFloors(2);
    }


    @Override
    public void addWindows(House h) {
        h.setWindows(10);
    }



}
