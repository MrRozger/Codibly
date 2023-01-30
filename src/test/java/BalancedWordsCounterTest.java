import org.example.BalancedWordsCounter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {

    BalancedWordsCounter balancedWordsCounter;

    @Before
    public void setUp() {
        balancedWordsCounter = new BalancedWordsCounter();
    }

    @Test
    public void test1() {
        assertEquals(28, balancedWordsCounter.count("aabbabcccba"));
    }

    @Test
    public void test2() {
        assertEquals(0, balancedWordsCounter.count(""));
    }

    @Test(expected = RuntimeException.class)
    public void test3() {
        balancedWordsCounter.count("abababa1");
    }

    @Test(expected = RuntimeException.class)
    public void test4()  {
        balancedWordsCounter.count(null);
    }
}