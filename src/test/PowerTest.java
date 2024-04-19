package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void testOfOneRaisedToPowerOne() {
        int actualResult = powerFinder.calculatePower(1,1);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOfTwoRaisedToPowerOne() {
        int actualResult = powerFinder.calculatePower(2,1);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOfTwoRaisedToPowerTwo) {
        int actualResult = powerFinder.calculatePower(2,2);
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOfThreeRaisedToPowerTwo() {
        int actualResult = powerFinder.calculatePower(3,2);
        int expectedResult = 9;
        assertEquals(expectedResult, actualResult);
    }
}
