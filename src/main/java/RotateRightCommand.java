public class RotateRightCommand implements Command {
    private Location location;

    public RotateRightCommand(Location location) {
        this.location = location;
    }

    @Override
    public Location execute() {
        switch (location.direction) {
            case NORTH:
                location.faceEast();
                break;
            case EAST:
                location.faceSouth();
                break;
            case SOUTH:
                location.faceWest();
                break;
            case WEST:
                location.faceNorth();
                break;
        }
        return location;
    }
}
