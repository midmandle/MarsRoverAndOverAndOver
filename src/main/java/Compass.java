public enum Compass {
    WEST("W"), EAST("E"), SOUTH("S"), NORTH("N");
    private String value;

    public String getValue() {
        return value;
    }

    Compass(String value) {
        this.value = value;
    }
}