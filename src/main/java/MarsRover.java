public class MarsRover {

    public static final char TURN_RIGHT = 'R';
    private final Coordinates coordinates = new Coordinates();
    private Compass direction = Compass.NORTH;

    public String execute(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == TURN_RIGHT) {
                rotateRight();
            }
        }
        return generateLocationString();
    }

    private String generateLocationString() {
        return coordinates.xCoordinate + "," + coordinates.yCoordinate + "," + direction;
    }

    private void rotateRight() {
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
