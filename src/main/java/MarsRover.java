public class MarsRover {
    private final Location location = new Location();

    public String execute(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if(instruction == Instruction.TURN_LEFT.getValue()) {
                location.rotateLeft();
            }
            if(instruction == Instruction.TURN_RIGHT.getValue()) {
                location.rotateRight();
            }
            if(instruction == Instruction.MOVE_FORWARD.getValue()){
                location.moveForward();
            }
        }
        return location.generateLocationString();
    }
}
