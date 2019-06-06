public class CommandFactory {
    public static final char ROTATE_RIGHT = 'R';
    public static final char ROTATE_LEFT = 'L';
    public static final char MOVE_FORWARD = 'M';
    private Location location;

    public CommandFactory(Location location) {
        this.location = location;
    }

    public Command generateCommand(char instruction) {
        switch (instruction) {
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
