public enum Compass {
    NORTH('N'), SOUTH('S'), EAST('E'), WEST('W');
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