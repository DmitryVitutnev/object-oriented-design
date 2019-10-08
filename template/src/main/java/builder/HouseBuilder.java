package builder;

import house.Foundation;
import house.House;
import house.Roof;

public abstract class HouseBuilder {

    public House build() {
        House h = new House();
        layFoundation(h);
        placeWalls(h);
        addFloors(h);
        placeDoors(h);
        addWindows(h);
        placeRoof(h);
        return h;
    }

    public void layFoundation(House h) {
        h.setFoundation(Foundation.NONE);
    }

    public void placeWalls(House h) {
        h.setWalls(4);
    }

    public void addFloors(House h) {
        h.setFloors(1);
    }

    public void placeDoors(House h) {
        h.setDoors(1);
    }

    public void addWindows(House h) {
        h.setWindows(0);
    }

    public void placeRoof(House h) {
        h.setRoof(Roof.TRIANGULAR);
    }


}
