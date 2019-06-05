public enum Instruction {
    TURN_LEFT('L'), TURN_RIGHT('R');
    private char value;

    public char getValue() {
        return value;
    }

    Instruction(char value) {
        this.value = value;
    }
}