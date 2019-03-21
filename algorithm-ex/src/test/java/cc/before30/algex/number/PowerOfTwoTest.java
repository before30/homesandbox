package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void isPowerOfTwo() {
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assert.assertTrue(powerOfTwo.isPowerOfTwo(1));
        Assert.assertTrue(powerOfTwo.isPowerOfTwo(16));
        Assert.assertTrue(powerOfTwo.isPowerOfTwo(256));
        Assert.assertFalse(powerOfTwo.isPowerOfTwo(218));

    }
}