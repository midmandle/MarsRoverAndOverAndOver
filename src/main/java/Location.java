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
}