import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    private static Stream<Arguments> rotateRightTests() {
        return Stream.of(
                Arguments.arguments("R", "0,0,E"),
                Arguments.arguments("RR", "0,0,S"),
                Arguments.arguments("RRR", "0,0,W"),
                Arguments.arguments("RRRR", "0,0,N")
        );
    }
    @ParameterizedTest
    @MethodSource("rotateRightTests")
    void rotates_right(String instructions, String expectedOutput) {
        assertEquals(expectedOutput, rover.execute(instructions));
    }

    private static Stream<Arguments> rotateLeftTests() {
        return Stream.of(
                Arguments.arguments("L", "0,0,W"),
                Arguments.arguments("LL", "0,0,S"),
                Arguments.arguments("LLL", "0,0,E"),
                Arguments.arguments("LLLL", "0,0,N")
        );
    }
    @ParameterizedTest
    @MethodSource("rotateLeftTests")
    void rotates_left(String instructions, String expectedOutput) {
        assertEquals(expectedOutput, rover.execute(instructions));
    }

    @Test
    void move_forward() {
        assertEquals("0,1,N", rover.execute("M"));
    }

    @Test
    void wrap_vertically() {
        assertEquals("0,0,N", rover.execute("MMMMMMMMMM"));
    }

    @Test
    void move_forward_facing_east() {
        assertEquals("1,0,E", rover.execute("RM"));
    }
}
