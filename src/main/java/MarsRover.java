public class MarsRover {

    public static final char ROTATE_RIGHT = 'R';
    public static final char ROTATE_LEFT = 'L';
    public static final char MOVE_FORWARD = 'M';
    private final Location location = new Location();

    public MarsRover() {
        location.direction = Compass.NORTH;
        location.coordinates = new Coordinates(0, 0);
    }

    public String execute(String instructions) {
        for (char command : instructions.toCharArray()) {
            handleCommand(command);
        }
        return location.generateLocationString();
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
        if(location.direction == Compass.SOUTH) {
            location.moveSouth();
        } else if(location.direction == Compass.WEST) {
            location.moveWest();
        } else if(location.direction == Compass.EAST)
            location.moveEast();
        else
            location.moveNorth();
    }

    private void rotateLeft() {
        switch (location.direction) {
            case NORTH:
                location.faceWest();
                break;
            case WEST:
                location.faceSouth();
                break;
            case SOUTH:
                location.faceEast();
                break;
            case EAST:
                location.faceNorth();
                break;
        }
    }

    private void rotateRight() {
        switch (location.direction) {
            case NORTH:
                location.faceEast();
                break;
            case EAST:
                location.faceSouth();
                break;
            case SOUTH:
                location.faceWest();
                break;
            case WEST:
                location.faceNorth();
                break;
        }
    }

}
