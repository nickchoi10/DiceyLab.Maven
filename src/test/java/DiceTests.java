import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class DiceTests {

    @Test
    public void tossAndSum() {
        Dice diceTest = new Dice(3);
        int value = diceTest.tossAndSum();
        boolean min = value >= 3;
        boolean max = value <= 18;
        assertTrue(min && max);

    }

    @Test
    public void tossAndSum1() {
        Dice diceTest = new Dice(2);
        int value = diceTest.tossAndSum();
        boolean min = value >= 2;
        boolean max = value <= 12;
        assertTrue(min && max);

    }

    @Test
    public void tossAndSum2() {
        Dice diceTest = new Dice(10);
        int value = diceTest.tossAndSum();
        boolean min = value >= 10;
        boolean max = value <= 60;
        assertTrue(min && max);
    }

    @Test
    public void tossAndSum3() {
        Dice diceTest = new Dice(1);
        int value = diceTest.tossAndSum();
        boolean min = value >= 1;
        boolean max = value <= 6;
        assertTrue(min && max);
    }
}
