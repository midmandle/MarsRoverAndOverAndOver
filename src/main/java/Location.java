public class Location {
    final Coordinates coordinates = new Coordinates();
    Compass direction;

    public Location() {
        this.direction = Compass.NORTH;
    }

    String generateLocationString() {
        return coordinates.xCoordinate + "," + coordinates.yCoordinate + "," + direction;
    }

    void rotateRight() {
        switch (direction) {
            case NORTH:
                direction = Compass.EAST;
                break;
            case SOUTH:
                direction = Compass.WEST;
                break;
            case EAST:
                direction = Compass.SOUTH;
                break;
            case WEST:
                direction = Compass.NORTH;
                break;
        }
    }

    public void rotateLeft() {
        switch (direction) {
            case NORTH:
                direction = Compass.WEST;
                break;
            case SOUTH:
                direction = Compass.EAST;
                break;
            case EAST:
                direction = Compass.NORTH;
                break;
            case WEST:
                direction = Compass.SOUTH;
                break;
        }
    }

    public void moveForward() {
        switch (direction) {
            case NORTH:
                moveNorth();
                break;
            case SOUTH:
                break;
            case EAST:
                moveEast();
                break;
            case WEST:
                moveWest();
                break;
        }
    }

    private void moveWest() {
        if(coordinates.xCoordinate - 1 < 0)
            coordinates.teleportToXCoordinate(9);
        else
            coordinates.decrementX();
    }

    private void moveEast() {
        if(coordinates.xCoordinate + 1 > 9)
            coordinates.teleportToXCoordinate(0);
        else
            coordinates.incrementX();
    }

    private void moveNorth() {
        if(coordinates.yCoordinate + 1 > 9)
            coordinates.teleportToYCoordinate(0);
        else
            coordinates.incrementY();
    }
}