public class MarsRover {

    private String xCoordinate;
    private String yCoordinate;
    private String direction;

    public String execute(String instructions) {
        xCoordinate = "0";
        yCoordinate = "0";
        direction = "N";
        return xCoordinate + "," + yCoordinate + "," + direction;
    }
}
