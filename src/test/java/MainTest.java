import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


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
        assertEquals(Math.sqrt(2), Main.spiderToFly("A1", "C1"), 1e-3d);
        assertEquals(Math.sqrt(8), Main.spiderToFly("B2", "D2"), 1e-3d);
    }

    @Test
    public void example() {
        assertEquals(4.63522d, Main.spiderToFly("H3", "E2"), 1e-3d);
    }

    @Test
    public void example10() {
        assertEquals(3.77394d, Main.spiderToFly("H1", "E3"), 1e-3d);
    }



//    Random test #1: spider=B3, fly=B2 => distance=1.00000
//    Random test #2: spider=B1, fly=A0 => distance=1.00000
//    Random test #3: spider=F1, fly=D4 => distance=4.12311
//    Random test #4: spider=B3, fly=E2 => distance=4.63522
//    Random test #5: spider=A0, fly=A4 => distance=4.00000
//    Random test #6: spider=A0, fly=C3 => distance=3.00000
//    Random test #7: spider=H1, fly=E3 => distance=3.77394
//
//    expected:<3.773942326946622> but was:<3.0>



}
