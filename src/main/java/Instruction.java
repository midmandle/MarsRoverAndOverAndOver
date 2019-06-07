public enum Instruction {
    TURN_RIGHT('R'), TURN_LEFT('L');
    private char value;

    public static boolean isTurnRight(char instruction) {
        return instruction == TURN_RIGHT.getValue();
    }

    public static boolean isTurnLeft(char instruction) {
        return instruction == TURN_LEFT.getValue();
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