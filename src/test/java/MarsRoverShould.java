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
}
