public class MarsRover {
    public static final String TURN_LEFT = "L";
    public static final String TURN_RIGHT = "R";
    private final Location location = new Location();

    public String execute(String instructions) {
        if(instructions.equals(TURN_LEFT))
            return location.generateLocationString(Compass.WEST);
        if(instructions.equals(TURN_RIGHT))
            return location.generateLocationString(Compass.EAST);
        if(instructions.equals(TURN_RIGHT + TURN_RIGHT))
            return location.generateLocationString(Compass.SOUTH);
        if(instructions.equals(TURN_RIGHT + TURN_RIGHT + TURN_RIGHT))
            return location.generateLocationString(Compass.WEST);
        return location.generateLocationString(Compass.NORTH);
    }

}
