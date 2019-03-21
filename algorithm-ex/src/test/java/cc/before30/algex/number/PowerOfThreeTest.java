package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfThreeTest {

    @Test
    public void isPowerOfThree() {

        PowerOfThree powerOfThree = new PowerOfThree();

        Assert.assertTrue(powerOfThree.isPowerOfThree(1));
        Assert.assertFalse(powerOfThree.isPowerOfThree(2));
        Assert.assertTrue(powerOfThree.isPowerOfThree(3));
        Assert.assertFalse(powerOfThree.isPowerOfThree(0));
        Assert.assertTrue(powerOfThree.isPowerOfThree(27));
        Assert.assertTrue(powerOfThree.isPowerOfThree(9));
        Assert.assertFalse(powerOfThree.isPowerOfThree(45));
    }
}