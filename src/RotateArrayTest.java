import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 5, 3}, RotateArray.rotate(new int[]{3, 4, 5}, -1), "");
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{7, 8, 1, 2, 3, 5, 6}, RotateArray.rotate(new int[]{1, 2, 3, 5, 6, 7, 8}, 2), "");
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{3, 4, 5}, RotateArray.rotate(new int[]{3, 4, 5}, 0), "");
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{2, 3, 5, 6, 7, 8, 1}, RotateArray.rotate(new int[]{1, 2, 3, 5, 6, 7, 8}, 76), "");
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{8, 9, 5, 6, 3, 4}, RotateArray.rotate(new int[]{3, 4, 8, 9, 5, 6}, -176), "");
    }
}