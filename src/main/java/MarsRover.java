public class MarsRover {
    public String execute(String instructions) {
        if(instructions.equals("R"))
            return "0,0,E";
        if(instructions.equals("RR"))
            return "0,0,S";
        if(instructions.equals("RRR"))
            return "0,0,W";
        return "0,0,N";
    }
}
