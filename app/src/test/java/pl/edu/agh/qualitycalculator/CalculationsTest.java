package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals((float)5.0, calculationsUnderTest.calculate(Operation.SUM, 2, 3));
    }

    @Test
    public void testDiv() throws Exception {
        assertEquals(2,calculationsUnderTest.calculate(Operation.DIVIDE, 6,3), 0.01);

    }
    @Test
    public void testSub() throws Exception{
        assertEquals(2,calculationsUnderTest.calculate(Operation.SUBTRACT,3,1),0.01);

    }
    @Test
    public  void testDzielZero() throws Exception{
        assertEquals(Float.POSITIVE_INFINITY,calculationsUnderTest.calculate(Operation.DIVIDE, 2,0),0.01);

    }
    @Test
    public  void testDzielZeroTwo() throws Exception{
        assertEquals(Float.POSITIVE_INFINITY,calculationsUnderTest.calculate(Operation.DIVIDE, 2,0),0.01);

    }
    @Test
    public void testMULTI() throws Exception{
        assertEquals(3,calculationsUnderTest.calculate(Operation.MULTIPLY,3,1),0.01);
    }






    @After
    public void tearDown() {
    }
}
