public class MarsRover {

    private final Coordinates coordinates = new Coordinates();
    private Compass direction = Compass.NORTH;

    public String execute(String instructions) {
        for (char instruction :
                instructions.toCharArray()) {
            if (instruction == 'R') {
                rotateRight();
            }
        }
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
