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

    private static Stream<Arguments> rightTurnTests() {
        return Stream.of(
                Arguments.arguments("R", "0,0,E"),
                Arguments.arguments("RR", "0,0,S"),
                Arguments.arguments("RRR", "0,0,W"),
                Arguments.arguments("RRRR", "0,0,N")

        );
    }

    @ParameterizedTest
    @MethodSource("rightTurnTests")
    public void turn_right(String instructions, String expectedLocation) {
        assertEquals(expectedLocation, rover.execute(instructions));
    }


    private static Stream<Arguments> leftTurnTests() {
        return Stream.of(
                Arguments.arguments("L", "0,0,W"),
                Arguments.arguments("LL", "0,0,S"),
                Arguments.arguments("LLL", "0,0,E"),
                Arguments.arguments("LLLL", "0,0,N")

        );
    }

    @ParameterizedTest
    @MethodSource("leftTurnTests")
    public void turn_left(String instructions, String expectedLocation) {
        assertEquals(expectedLocation, rover.execute(instructions));
    }

    private static Stream<Arguments> moveAroundMapTests() {
        return Stream.of(
                Arguments.arguments("M", "0,1,N"),
                Arguments.arguments("MMMMMMMMMM", "0,0,N"),
                Arguments.arguments("RM", "1,0,E"),
                Arguments.arguments("RMMMMMMMMMM", "0,0,E"),
                Arguments.arguments("RMLLM", "0,0,W"),
                Arguments.arguments("LM", "9,0,W"),
                Arguments.arguments("MRRM", "0,0,S")
        );
    }

    @ParameterizedTest
    @MethodSource("moveAroundMapTests")
    public void move_around(String instructions, String expectedLocation) {
        assertEquals(expectedLocation, rover.execute(instructions));
    }
}
