import org.example.BubbleSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {
    BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testSort1() {
        List<Comparable> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> expectedOutput = Arrays.asList(1, 3, 4, 5, 6, 8, 8);
        List<Comparable> result1 = bubbleSort.sort(input);
        assertEquals(expectedOutput, result1);
    }

    @Test
    public void testSort2() {
        List<Comparable> input = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Comparable> expected = Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);
        List<Comparable> result = bubbleSort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    public void testSort3() {
        List<Comparable> input = Arrays.asList();
        List<Comparable> expectedOutput = Arrays.asList();
        List<Comparable> result = bubbleSort.sort(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testSort4() {
        List<Comparable> input = Arrays.asList(null, 5.0001);
        List<Comparable> expectedOutput = Arrays.asList(5.0001);
        List<Comparable> result = bubbleSort.sort(input);
        assertEquals(expectedOutput, result);
    }

    @Test(expected = RuntimeException.class)
    public void testSort5() {
        bubbleSort.sort(null);
    }
}