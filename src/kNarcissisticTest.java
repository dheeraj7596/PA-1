import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class kNarcissisticTest {
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), kNarcissistic.getKN(1), "");
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(), kNarcissistic.getKN(2), "");
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(153, 370, 371, 407), kNarcissistic.getKN(3), "");
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList(54748, 92727, 93084), kNarcissistic.getKN(5), "");
    }
}