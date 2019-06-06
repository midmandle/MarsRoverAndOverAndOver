public enum Compass {
    NORTH('N'), WEST('W'), SOUTH('S'), EAST('E');
    private char value;

    public char getValue() {
        return value;
    }

    Compass(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}