import org.junit.jupiter.api.Test;

import javax.sql.rowset.CachedRowSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    @Test
    void start_at_0_0_N() {
        MarsRover rover = new MarsRover();
        assertEquals("0,0,N", rover.execute());
    }
}
