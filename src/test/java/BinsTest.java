import org.testng.Assert;
import org.testng.annotations.Test;

public class BinsTest {

    @Test
    void BinTest() {
        Bins result = new Bins(2, 12); //for bins from 2..12
        result.incrementBin(2); //increment bin #2
        int expected = 1;
        int numberOfTwos = result.getBin(2); //return the number of twos in the 2 bin.
        Assert.assertEquals(expected, numberOfTwos);
    }
    @Test

    void BinTest2(){
        Bins result = new Bins(2,12);
        result.incrementBin(2);
        result.incrementBin(2);
        result.incrementBin(2);
        result.incrementBin(2); //increment bin #2 4x times...
        int numberOfTwos = result.getBin(2);
        Assert.assertEquals(4, numberOfTwos);

    }
    @Test
    void BinTest1(){
        Bins bins = new Bins(4,24);
        bins.incrementBin(4);
        int expected = 1, actual = bins.getBin(4);
        Assert.assertEquals(expected, actual);
    }
}
