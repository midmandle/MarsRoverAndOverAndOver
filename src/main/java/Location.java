public class Location {
    Coordinates coordinates;
    Compass direction;

    public Location() {
        direction = Compass.NORTH;
        coordinates = new Coordinates(0, 0);
    }

    char currentDirection() {
        return direction.getValue();
    }

    public void rotateLeft() {
        switch(direction) {
            case NORTH:
                direction = Compass.WEST;
                break;
            case EAST:
                direction = Compass.NORTH;
                break;
            case SOUTH:
                direction = Compass.EAST;
                break;
            case WEST:
                direction = Compass.SOUTH;
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public void rotateRight() {
        switch(direction){
            case NORTH:
                direction = Compass.EAST;
                break;
            case EAST:
                direction = Compass.SOUTH;
                break;
            case SOUTH:
                direction = Compass.WEST;
                break;
            case WEST:
                direction = Compass.NORTH;
                break;
            default:
                throw  new UnsupportedOperationException();
        }
    }

    public String generateLocationString() {
        return coordinates.currentXCoordinate() + "," + coordinates.currentYCoordinate() + "," + currentDirection();
    }

    public void moveForward() {
        switch (direction){
            case NORTH:
                moveNorth();
                break;
            case EAST:
                moveEast();
                break;
            case SOUTH:
                moveSouth();
                break;
            case WEST:
                moveWest();
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private void moveNorth() {
        final int nextYCoordinate = coordinates.incrementY();
        coordinates.yCoordinate = nextYCoordinate <= 9 ? nextYCoordinate : 0;
    }

    private void moveSouth() {
        final int nextYCoordinate = coordinates.decrementY();
        coordinates.yCoordinate = nextYCoordinate >= 0 ? nextYCoordinate : 9;
    }

    private void moveWest() {
        final int nextXCoordinate = coordinates.decrementX();
        coordinates.xCoordinate = nextXCoordinate >= 0 ? nextXCoordinate : 9;
    }

    private void moveEast() {
        final int nextXCoordinate = coordinates.incrementX();
        coordinates.xCoordinate = nextXCoordinate <= 9 ? nextXCoordinate : 0;
    }

}