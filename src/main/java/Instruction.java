public enum Instruction {
    TURN_RIGHT('R'), TURN_LEFT('L');
    private char value;

    public char getValue() {
        return value;
    }

    Instruction(char value) {
        this.value = value;
    }
}