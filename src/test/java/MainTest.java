import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void example() {
        assertEquals(4.63522d, Main.spiderToFly("H3", "E2"), 1e-3d);
    }

    @Test
    public void same() {
        assertEquals(0d, Main.spiderToFly("C2", "C2"), 1e-3d);
        assertEquals(0d, Main.spiderToFly("A0", "A0"), 1e-3d);
        assertEquals(0d, Main.spiderToFly("F3", "F3"), 1e-3d);
    }

    @Test
    public void radialOut() {
        assertEquals(1d, Main.spiderToFly("H1", "H2"), 1e-3d);
        assertEquals(3d, Main.spiderToFly("H1", "H4"), 1e-3d);
    }

    @Test
    public void radialThruTheMiddle() {
        assertEquals(8d, Main.spiderToFly("G4", "C4"), 1e-3d);
        assertEquals(7d, Main.spiderToFly("G4", "C3"), 1e-3d);
    }

    @Test
    public void radial4() {
        assertEquals( Math.sqrt(2), Main.spiderToFly("A1", "C1"), 1e-3d);
        assertEquals( Math.sqrt(8), Main.spiderToFly("B2", "D2"), 1e-3d);
    }




}
