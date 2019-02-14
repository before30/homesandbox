package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    @Test
    public void binaryGap() {

        BinaryGap gap = new BinaryGap();

        Assert.assertEquals(2, gap.binaryGap(22));
        Assert.assertEquals(2, gap.binaryGap(5));
        Assert.assertEquals(1, gap.binaryGap(6));
        Assert.assertEquals(0, gap.binaryGap(8));

    }
}