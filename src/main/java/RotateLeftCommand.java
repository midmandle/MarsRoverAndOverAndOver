public class RotateLeftCommand implements Command {
    private Location location;

    public RotateLeftCommand(Location location) {
        this.location = location;
    }

    @Override
    public Location execute() {
        switch (location.direction) {
            case NORTH:
                location.faceWest();
                break;
            case WEST:
                location.faceSouth();
                break;
            case SOUTH:
                location.faceEast();
                break;
            case EAST:
                location.faceNorth();
                break;
        }
        return location;
    }
}
