public class MarsRover {

    private final Coordinates coordinates;
    private Compass direction;

    public MarsRover() {
        direction = Compass.NORTH;
        coordinates = new Coordinates(0, 0);
    }

    public String execute(String instructions) {
        for (char command : instructions.toCharArray()) {
            handleCommand(command);
        }
        return this.generateLocationString();
    }

    private void handleCommand(char command) {
        if (command == 'R')
            rotateRight();
        if(command == 'L')
            rotateLeft();
        if(command == 'M')
            moveForward();
    }

    private void moveForward() {
        moveNorth();
    }

    private void moveNorth() {
        if(hasHitNorthBoundary()) {
            wrapAroundNorthernEdge();
        } else {
            coordinates.incrementYCoordinate();
        }
    }

    private void wrapAroundNorthernEdge() {
        coordinates.yCoordinate = 0;
    }

    private boolean hasHitNorthBoundary() {
        return coordinates.yCoordinate + 1 > 9;
    }

    private void rotateLeft() {
        switch (direction) {
            case NORTH:
                faceWest();
                break;
            case WEST:
                faceSouth();
                break;
            case SOUTH:
                faceEast();
                break;
            case EAST:
                faceNorth();
                break;
        }
    }

    private void rotateRight() {
        switch (direction) {
            case NORTH:
                faceEast();
                break;
            case EAST:
                faceSouth();
                break;
            case SOUTH:
                faceWest();
                break;
            case WEST:
                faceNorth();
                break;
        }
    }

    private void faceNorth() {
        this.direction = Compass.NORTH;
    }

    private void faceEast() {
        this.direction = Compass.EAST;
    }

    private void faceSouth() {
        this.direction = Compass.SOUTH;
    }

    private void faceWest() {
        this.direction = Compass.WEST;
    }

    private String generateLocationString() {
        return this.coordinates + "," + this.direction;
    }
}
