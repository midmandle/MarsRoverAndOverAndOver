public class MarsRover {
    public static final char TURN_RIGHT = 'R';
    private final Location location = new Location();

    public String execute(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == TURN_RIGHT)
                location.rotateRight();
            if(instruction == 'L')
                location.rotateLeft();
        }
        return location.generateLocationString();
    }
}
