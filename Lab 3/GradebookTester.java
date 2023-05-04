package application;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
    private Gradebook gb1;
    private Gradebook gb2;

    @Before
    public void setUp() throws Exception {
        gb1 = new Gradebook(5);
        gb2 = new Gradebook(5);
        gb1.addScore(75.0);
        gb1.addScore(80.0);
        gb1.addScore(85.0);
        gb2.addScore(90.0);
        gb2.addScore(95.0);
        gb2.addScore(100.0);
    }

    @After
    public void tearDown() throws Exception {
        gb1 = null;
        gb2 = null;
    }

    @Test
    public void testAddScore() {
        assertTrue(gb1.toString().equals("75.0 80.0 85.0"));
        assertTrue(gb2.toString().equals("90.0 95.0 100.0"));
        assertEquals(3, gb1.getScoreSize());
        assertEquals(3, gb2.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(240.0, gb1.sum(), .0001);
        assertEquals(285.0, gb2.sum(), .0001);
    }

    @Test
    public void testMinimum() {
        assertEquals(75.0, gb1.minimum(), .001);
        assertEquals(90.0, gb2.minimum(), .001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(240.0 - 75.0, gb1.finalScore(), .0001);
        assertEquals(285.0 - 90.0, gb2.finalScore(), .0001);
    }
}