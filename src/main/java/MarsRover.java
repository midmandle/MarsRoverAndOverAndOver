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
            if(command == 'L')
                rotateLeft();
            if(command == 'M')
                moveForward();
        }
        return this.generateLocationString();
    }

    private void moveForward() {
        if(coordinates.yCoordinate + 1 > 9)
            coordinates.yCoordinate = 0;
        else
            coordinates.yCoordinate += 1;
    }

    private void rotateLeft() {
        switch (direction) {
            case 'N':
                faceWest();
                break;
            case 'W':
                faceSouth();
                break;
            case 'S':
                faceEast();
                break;
            case 'E':
                faceNorth();
                break;
        }
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
