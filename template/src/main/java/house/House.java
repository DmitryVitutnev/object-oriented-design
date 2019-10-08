package house;

public class House {

    private Foundation foundation;
    private int walls;
    private int floors;
    private int doors;
    private int windows;
    private Roof roof;

    public House() {
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation=" + foundation +
                ", walls=" + walls +
                ", floors=" + floors +
                ", doors=" + doors +
                ", windows=" + windows +
                ", roof=" + roof +
                '}';
    }
}
