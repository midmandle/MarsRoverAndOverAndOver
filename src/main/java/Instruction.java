public enum Instruction {
    TURN_RIGHT('R'), TURN_LEFT('L'), MOVE_FORWARD('M');
    private char value;

    public static boolean isTurnRight(char instruction) {
        return instruction == TURN_RIGHT.getValue();
    }

    public static boolean isTurnLeft(char instruction) {
        return instruction == TURN_LEFT.getValue();
    }

    public static boolean isMoveForward(char instruction) {
        return instruction == MOVE_FORWARD.getValue();
    }

    public char getValue() {
        return value;
    }

    Instruction(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}