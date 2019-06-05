import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.swing.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

    private MarsRover rover;

    @BeforeEach
    void setUp() {
        rover = new MarsRover();
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

    @Test
    void start_at_0_0_N() {
        assertEquals("0,0,N", rover.execute(""));
    }
}
