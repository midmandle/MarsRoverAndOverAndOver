public class Coordinates {
    Integer yCoordinate = 0;
    Integer xCoordinate = 0;

    public Coordinates(int xCoordinate, int yCoordinate) {
    }

    Integer currentYCoordinate() {
        return yCoordinate;
    }

    Integer currentXCoordinate() {
        return xCoordinate;
    }

    int incrementX() {
        return xCoordinate + 1;
    }

    int decrementX() {
        return xCoordinate - 1;
    }

    int decrementY() {
        return yCoordinate - 1;
    }

    int incrementY() {
        return yCoordinate + 1;
    }
}