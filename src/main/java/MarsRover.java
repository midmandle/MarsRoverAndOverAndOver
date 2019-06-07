public class MarsRover {

    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final char EAST = 'E';
    private final Coordinates coordinates = new Coordinates();
    private Character direction = NORTH;

    public String execute(String instructions) {
        if(instructions.equals("RR"))
            direction = SOUTH;
        if(instructions.equals("R"))
            direction = EAST;

        return coordinates.xCoordinate + "," + coordinates.yCoordinate + "," + direction;
    }
}
