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
}
