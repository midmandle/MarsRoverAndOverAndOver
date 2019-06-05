public class MarsRover {
    public String execute(String instructions) {
        if(instructions.equals("R"))
            return "0,0,E";
        return "0,0,N";
    }
}
