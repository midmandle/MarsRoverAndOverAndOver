import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    @Test
    void start_at_0_0_N() {
        MarsRover rover = new MarsRover();
        assertEquals("0,0,N", rover.execute(""));
    }

    @Test
    void rotate_right_to_face_east() {
        MarsRover rover = new MarsRover();
        assertEquals("0,0,E", rover.execute("R"));
    }

    @Test
    void rover_rotates_right_twice_to_face_south() {
        MarsRover rover = new MarsRover();
        assertEquals("0,0,S", rover.execute("RR"));
    }

    @Test
    void rover_rotates_right_three_times_to_face_west() {
        MarsRover rover = new MarsRover();
        assertEquals("0,0,W", rover.execute("RRR"));
    }
}
