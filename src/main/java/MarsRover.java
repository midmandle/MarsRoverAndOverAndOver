public class MarsRover {
    private final Location location = new Location();

    public String execute(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (Instruction.isTurnRight(instruction))
                location.rotateRight();
            if(Instruction.isTurnLeft(instruction))
                location.rotateLeft();
            if(Instruction.isMoveForward(instruction))
                location.moveForward();
        }
        return location.generateLocationString();
    }
}
