public enum Compass {
    NORTH('N'), WEST('W'), SOUTH('S'), EAST('E');
    private char value;

    Compass(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}