public class MarsRover {

    private int xCoordinate;
    private int yCoordinate;
    private char direction;

    public MarsRover() {
        xCoordinate = 0;
        yCoordinate = 0;
        direction = 'N';
    }

    public String execute(String instructions) {
        if(instructions.equals("RRR")){
            this.direction = 'W';
            return generateLocationString();
        }
        if(instructions.equals("RR")){
            this.direction = 'S';
            return generateLocationString();
        }
        if(instructions.equals("R")) {
            this.direction = 'E';
            return generateLocationString();
        }
        return this.generateLocationString();
    }

    private String generateLocationString() {
        return this.xCoordinate + "," + this.yCoordinate + "," + this.direction;
    }
}
