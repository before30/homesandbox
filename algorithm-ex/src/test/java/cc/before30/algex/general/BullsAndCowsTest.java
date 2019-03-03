package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BullsAndCowsTest {

    @Test
    public void getHint() {

        BullsAndCows bullsAndCows = new BullsAndCows();
        Assert.assertEquals("1A3B", bullsAndCows.getHint("1807", "7810"));
        Assert.assertEquals("1A1B", bullsAndCows.getHint("1123", "0111"));
        Assert.assertEquals("0A1B", bullsAndCows.getHint("1122", "0001"));
    }
}