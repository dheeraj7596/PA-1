import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicalChairsTest {
    @Test
    public void test1() {
        assertEquals(1, MusicalChairs.play(2, Arrays.asList(1)), "");
    }

    @Test
    public void test2() {
        assertEquals(1, MusicalChairs.play(8, Arrays.asList(3, 5, 8, 21, 5, 2, 0)), "");
    }

    @Test
    public void test3() {
        assertEquals(-1, MusicalChairs.play(0, Arrays.asList(1,4,5)), "");
    }

    @Test
    public void test4() {
        assertEquals(0, MusicalChairs.play(2, Arrays.asList(0)), "");
    }
}