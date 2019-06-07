public class Coordinates {
    int xCoordinate = 0;
    int yCoordinate = 0;

    public Coordinates() {
    }

    public void incrementY() {
        yCoordinate += 1;
    }

    public void teleportToYCoordinate(int newYCoordinate) {
        yCoordinate = newYCoordinate;
    }

    public void incrementX() {
        xCoordinate += 1;
    }

    public void teleportToXCoordinate(int newXCoordinate) {
        xCoordinate = newXCoordinate;
    }
}