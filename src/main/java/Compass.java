public enum Compass {
    WEST('W'), EAST('E'), SOUTH('S'), NORTH('N');
    private char value;

    public char getValue() {
        return value;
    }

    Compass(char value) {
        this.value = value;
    }
}