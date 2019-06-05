import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

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
    void rotate_right() {
        assertEquals("0,0,E", rover.execute("R"));
    }

    @Test
    void rotates_right_twice() {
        assertEquals("0,0,S", rover.execute("RR"));
    }

    @Test
    void rotate_right_three_times() {
        assertEquals("0,0,W", rover.execute("RRR"));
    }

    @Test
    void rotate_full_circle_right() {
        assertEquals("0,0,N", rover.execute("RRRR"));
    }
}
