public class Location {
    Coordinates coordinates;
    Compass direction;

    public Location(int xCoordinate, int yCoordinate, Compass direction) {
        coordinates = new Coordinates(xCoordinate,yCoordinate);
        this.direction = direction;
    }

    void moveSouth() {
        coordinates.decrementYCoordinate();
        if (hasHitSouthernEdge())
            wrapAroundSouthernEdge();
    }

    void moveWest() {
        coordinates.decrementXCoordinate();
        if (hasHitWesternEdge())
            wrapAroundWesternEdge();
    }

    void moveEast() {
        coordinates.incrementXCoordinate();
        if (hasHitEasternEdge())
            wrapAroundEasternEdge();
    }

    void moveNorth() {
        coordinates.incrementYCoordinate();
        if (hasHitNorthBoundary())
            wrapAroundNorthernEdge();
    }

    private void wrapAroundNorthernEdge() {
        coordinates.yCoordinate = 0;
    }

    private void wrapAroundEasternEdge() {
        coordinates.xCoordinate = 0;
    }

    private void wrapAroundSouthernEdge() {
        coordinates.yCoordinate = 9;
    }

    private void wrapAroundWesternEdge() {
        coordinates.xCoordinate = 9;
    }

    private boolean hasHitNorthBoundary() {
        return coordinates.yCoordinate > 9;
    }

    private boolean hasHitEasternEdge() {
        return coordinates.xCoordinate > 9;
    }

    private boolean hasHitSouthernEdge() {
        return coordinates.yCoordinate < 0;
    }

    private boolean hasHitWesternEdge() {
        return coordinates.xCoordinate < 0;
    }

    void faceNorth() {
        this.direction = Compass.NORTH;
    }

    void faceEast() {
        this.direction = Compass.EAST;
    }

    void faceSouth() {
        this.direction = Compass.SOUTH;
    }

    void faceWest() {
        this.direction = Compass.WEST;
    }

    String generateLocationString() {
        return this.coordinates + "," + this.direction;
    }
}