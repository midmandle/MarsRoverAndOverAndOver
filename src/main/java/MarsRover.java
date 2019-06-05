public class MarsRover {
    public static final String TURN_LEFT = "L";
    public static final String TURN_RIGHT = "R";
    private String direction;
    private String yCoordinate = "0";
    private String xCoordinate = "0";

    public String execute(String instructions) {
        if(instructions.equals(TURN_LEFT))
            return generateLocationString("W");
        if(instructions.equals(TURN_RIGHT))
            return generateLocationString("E");
        if(instructions.equals(TURN_RIGHT + TURN_RIGHT))
            return generateLocationString("S");
        if(instructions.equals(TURN_RIGHT + TURN_RIGHT + TURN_RIGHT))
            return generateLocationString("W");
        return generateLocationString("N");
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
