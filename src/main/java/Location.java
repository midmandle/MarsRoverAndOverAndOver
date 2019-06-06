public class Location {
    Coordinates coordinates;
    Compass direction;

    public Location() {
        coordinates = new Coordinates(0,0);
        direction = Compass.NORTH;
    }

    void moveSouth() {
        coordinates.decrementYCoordinate();
        if (hasHitSouthernEdge())
            wrapAroundSouthernEdge();
    }

    private void wrapAroundSouthernEdge() {
        coordinates.yCoordinate = 9;
    }

    private boolean hasHitSouthernEdge() {
        return coordinates.yCoordinate < 0;
    }

    void moveWest() {
        coordinates.decrementXCoordinate();
        if (hasHitWesternEdge())
            wrapAroundWesternEdge();
    }

    private void wrapAroundWesternEdge() {
        coordinates.xCoordinate = 9;
    }

    private boolean hasHitWesternEdge() {
        return coordinates.xCoordinate < 0;
    }

    void moveEast() {
        coordinates.incrementXCoordinate();
        if (hasHitEasternEdge())
            wrapAroundEasternEdge();
    }

    private void wrapAroundEasternEdge() {
        coordinates.xCoordinate = 0;
    }

    private boolean hasHitEasternEdge() {
        return coordinates.xCoordinate > 9;
    }

    void moveNorth() {
        coordinates.incrementYCoordinate();
        if (hasHitNorthBoundary())
            wrapAroundNorthernEdge();
    }

    private void wrapAroundNorthernEdge() {
        coordinates.yCoordinate = 0;
    }

    private boolean hasHitNorthBoundary() {
        return coordinates.yCoordinate > 9;
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