public class MarsRover {
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
        CommandFactory commandFactory = new CommandFactory(location);
        Command command = commandFactory.generateCommand(instruction);
        location = command.execute();
    }
}
