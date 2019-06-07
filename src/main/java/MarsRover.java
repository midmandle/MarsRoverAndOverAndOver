public class MarsRover {

    private final Coordinates coordinates = new Coordinates();
    private String direction = "N";

    public String execute(String instructions) {
        if(instructions.equals("RR"))
            direction = "S";
        if(instructions.equals("R"))
            direction = "E";

        return coordinates.xCoordinate + "," + coordinates.yCoordinate + "," + direction;
    }
}
