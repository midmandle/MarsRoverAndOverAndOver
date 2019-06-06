import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

    private MarsRover rover;

    @BeforeEach
    void setUp() {
        rover = new MarsRover();
    }

    @Test
    void start_at_0_0_N() {
        assertEquals("0,0,N", rover.execute(""));
    }

    @Test
    void rotate_right_to_face_east() {
        assertEquals("0,0,E", rover.execute("R"));
    }

    @Test
    void rotate_right_twice_to_face_south() {
        assertEquals("0,0,S", rover.execute("RR"));
    }
}
