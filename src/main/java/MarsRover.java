public class MarsRover {
    private String direction;
    private String yCoordinate = "0";
    private String xCoordinate = "0";

    public String execute(String instructions) {
        if(instructions.equals("L"))
            return generateLocationString("W");
        if(instructions.equals("R"))
            return generateLocationString("E");
        if(instructions.equals("RR"))
            return generateLocationString("S");
        if(instructions.equals("RRR"))
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
