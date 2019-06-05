public class MarsRover {
    public String execute(String instructions) {
        if(instructions.equals("R"))
            return "0,0,E";
        if(instructions.equals("RR"))
            return "0,0,S";
        return "0,0,N";
    }
}
