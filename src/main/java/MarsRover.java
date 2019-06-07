public class MarsRover {

    private int xCoordinate = 0;
    private int yCoordinate = 0;
    private String direction = "N";

    public String execute(String instructions) {
        if(instructions.equals("RR"))
            direction = "S";
        if(instructions.equals("R"))
            direction = "E";

        return xCoordinate + "," + yCoordinate + "," + direction;
    }
}
