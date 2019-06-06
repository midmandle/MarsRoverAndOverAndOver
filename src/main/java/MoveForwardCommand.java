public class MoveForwardCommand implements Command {
    private Location location;

    public MoveForwardCommand(Location location) {
        this.location = location;
    }

    @Override
    public Location execute() {
        if(location.direction == Compass.SOUTH) {
            location.moveSouth();
        } else if(location.direction == Compass.WEST) {
            location.moveWest();
        } else if(location.direction == Compass.EAST)
            location.moveEast();
        else
            location.moveNorth();
        return location;
    }
}
