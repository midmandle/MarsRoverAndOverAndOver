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
                Arguments.arguments("0,0,E", "R"),
                Arguments.arguments("0,0,S", "RR"),
                Arguments.arguments("0,0,W", "RRR"),
                Arguments.arguments("0,0,N", "RRRR")
        );
    }

    @ParameterizedTest
    @MethodSource("rotateRightTests")
    public void rotateRight(String expectedLocation, String instructions) {
        assertEquals(expectedLocation, rover.execute(instructions));
    }

    private static Stream<Arguments> rotateLeftTests() {
        return Stream.of(
                Arguments.arguments("0,0,W", "L"),
                Arguments.arguments("0,0,S", "LL"),
                Arguments.arguments("0,0,E", "LLL"),
                Arguments.arguments("0,0,N", "LLLL")
        );
    }

    @ParameterizedTest
    @MethodSource("rotateLeftTests")
    public void rotateLeft(String expectedLocation, String instructions) {
        assertEquals(expectedLocation, rover.execute(instructions));
    }

    private static Stream<Arguments> moveForwardTests() {
        return Stream.of(
                Arguments.arguments("0,1,N", "M"),
                Arguments.arguments("0,0,N", "MMMMMMMMMM"),
                Arguments.arguments("1,0,E", "RM"),
                Arguments.arguments("0,0,E", "RMMMMMMMMMM"),
                Arguments.arguments("0,0,W", "RMLLM")
        );
    }

    @ParameterizedTest
    @MethodSource("moveForwardTests")
    public void move_in_direction_facing(String expectedLocation, String instructions) {
        assertEquals(expectedLocation, rover.execute(instructions));
    }
}
