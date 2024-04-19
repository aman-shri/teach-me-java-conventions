package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void testOfOneRaisedToPowerOne() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void testOfTwoRaisedToPowerOne() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void testOfTwoRaisedToPowerTwo) {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void testOfThreeRaisedToPowerTwo() {
        assert powerfinder.OF(3, 2) == 9;
    }
}
