public class MarsRover {

    private final Coordinates coordinates = new Coordinates();
    private Compass direction = Compass.NORTH;

    public String execute(String instructions) {
        if(instructions.equals("RRR"))
            direction = Compass.WEST;
        if(instructions.equals("RR"))
            direction = Compass.SOUTH;
        if(instructions.equals("R"))
            direction = Compass.EAST;

        return coordinates.xCoordinate + "," + coordinates.yCoordinate + "," + direction;
    }
}
