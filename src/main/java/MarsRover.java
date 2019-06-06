public class MarsRover {

    public static final char ROTATE_RIGHT = 'R';
    public static final char ROTATE_LEFT = 'L';
    public static final char MOVE_FORWARD = 'M';
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
        switch (command) {
            case ROTATE_RIGHT:
                rotateRight();
                break;
            case ROTATE_LEFT:
                rotateLeft();
                break;
            case MOVE_FORWARD:
                moveForward();
                break;
        }
    }

    private void moveForward() {
        if(direction == Compass.EAST)
            moveEast();
        else
            moveNorth();
    }

    private void moveEast() {
        if(coordinates.xCoordinate + 1 > 9)
            coordinates.xCoordinate = 0;
        else
            coordinates.incrementXCoordinate();
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
