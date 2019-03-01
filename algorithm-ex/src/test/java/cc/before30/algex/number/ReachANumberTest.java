package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReachANumberTest {

    @Test
    public void reachNumber() {
        ReachANumber reach = new ReachANumber();

        Assert.assertEquals(2, reach.reachNumber(3));
        Assert.assertEquals(3, reach.reachNumber(2));
    }
}