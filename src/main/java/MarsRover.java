public class MarsRover {

    private String xCoordinate = "0";
    private String yCoordinate = "0";
    private String direction = "N";

    public String execute(String instructions) {
        if(instructions.equals("R"))
            direction = "E";

        return xCoordinate + "," + yCoordinate + "," + direction;
    }
}
