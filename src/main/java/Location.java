public class Location {
    final Coordinates coordinates = new Coordinates();
    Compass direction;

    public Location() {
    }

    String generateLocationString(Compass newDirection) {
        direction = newDirection;
        return coordinates.currentXCoordinate() + "," + coordinates.currentYCoordinate() + "," + currentDirection();
    }

    String currentDirection() {
        return direction.getValue();
    }
}