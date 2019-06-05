public class MarsRover {
    public static final String TURN_LEFT = "L";
    public static final String TURN_RIGHT = "R";
    public static final String WEST = "W";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String NORTH = "N";
    private String direction;
    private String yCoordinate = "0";
    private String xCoordinate = "0";

    public String execute(String instructions) {
        if(instructions.equals(TURN_LEFT))
            return generateLocationString(WEST);
        if(instructions.equals(TURN_RIGHT))
            return generateLocationString(EAST);
        if(instructions.equals(TURN_RIGHT + TURN_RIGHT))
            return generateLocationString(SOUTH);
        if(instructions.equals(TURN_RIGHT + TURN_RIGHT + TURN_RIGHT))
            return generateLocationString(WEST);
        return generateLocationString(NORTH);
    }

    private String generateLocationString(String newDirection) {
        direction = newDirection;
        return currentXCoordinate() + "," + currentYCoordinate() + "," + currentDirection();
    }

    private String currentDirection() {
        return direction;
    }

    private String currentYCoordinate() {
        return yCoordinate;
    }

    private String currentXCoordinate() {
        return xCoordinate;
    }
}
