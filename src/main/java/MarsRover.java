public class MarsRover {
    public static final String TURN_LEFT = "L";
    public static final String TURN_RIGHT = "R";
    private final Coordinates coordinates = new Coordinates();
    private Compass direction;

    public String execute(String instructions) {
        if(instructions.equals(TURN_LEFT))
            return generateLocationString(Compass.WEST);
        if(instructions.equals(TURN_RIGHT))
            return generateLocationString(Compass.EAST);
        if(instructions.equals(TURN_RIGHT + TURN_RIGHT))
            return generateLocationString(Compass.SOUTH);
        if(instructions.equals(TURN_RIGHT + TURN_RIGHT + TURN_RIGHT))
            return generateLocationString(Compass.WEST);
        return generateLocationString(Compass.NORTH);
    }

    private String generateLocationString(Compass newDirection) {
        direction = newDirection;
        return coordinates.currentXCoordinate() + "," + coordinates.currentYCoordinate() + "," + currentDirection();
    }

    private String currentDirection() {
        return direction.getValue();
    }

}
