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
        if(direction == Compass.EAST) {
            if(coordinates.xCoordinate + 1 <= 9)
                coordinates.xCoordinate += 1;
            else
                coordinates.xCoordinate = 0;
            return;
        }
        if(direction == Compass.WEST) {
            coordinates.xCoordinate -= 1;
            return;
        }
        if(coordinates.yCoordinate + 1 <= 9)
            coordinates.yCoordinate += 1;
        else
            coordinates.yCoordinate = 0;
    }
}