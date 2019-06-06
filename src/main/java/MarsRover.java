public class MarsRover {

    public static final char ROTATE_RIGHT = 'R';
    public static final char ROTATE_LEFT = 'L';
    public static final char MOVE_FORWARD = 'M';
    private Location location;

    public MarsRover() {
        location = new Location();
    }

    public String execute(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            handleCommand(instruction);
        }
        return location.generateLocationString();
    }

    private void handleCommand(char instruction) {
        Command command = generateCommand(instruction);
        location = command.execute();
    }

    private Command generateCommand(char command) {
        switch (command) {
            case ROTATE_RIGHT:
                return new RotateRightCommand(location);
            case ROTATE_LEFT:
                return new RotateLeftCommand(location);
            case MOVE_FORWARD:
                return new MoveForwardCommand(location);
            default:
                throw new UnsupportedOperationException();
        }
    }

}
