public class MarsRover {

    private final Coordinates coordinates;
    private char direction;

    public MarsRover() {
        direction = 'N';
        coordinates = new Coordinates(0, 0);
    }

    public String execute(String instructions) {
        for (char command : instructions.toCharArray()) {
            if (command == 'R')
                rotateRight();
        }
        return this.generateLocationString();
    }

    private void rotateRight() {
        switch (direction) {
            case 'N':
                faceEast();
                break;
            case 'E':
                faceSouth();
                break;
            case 'S':
                faceWest();
                break;
            case 'W':
                faceNorth();
                break;
        }
    }

    private void faceNorth() {
        this.direction = 'N';
    }

    private void faceEast() {
        this.direction = 'E';
    }

    private void faceSouth() {
        this.direction = 'S';
    }

    private void faceWest() {
        this.direction = 'W';
    }

    private String generateLocationString() {
        return this.coordinates + "," + this.direction;
    }
}
