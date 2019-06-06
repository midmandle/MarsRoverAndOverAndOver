public class Coordinates {
    int xCoordinate;
    int yCoordinate;

    public Coordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return xCoordinate + "," + yCoordinate;
    }

    void incrementYCoordinate() {
        yCoordinate += 1;
    }

    public void incrementXCoordinate() {
        xCoordinate += 1;
    }

    void decrementXCoordinate() {
        xCoordinate -= 1;
    }
}