package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

/**
 * Input: 28
 * Output: True
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 */
public class PerfectNumberTest {

    @Test
    public void checkPerfectNumber() {
        PerfectNumber perfectNumber = new PerfectNumber();
        Assert.assertTrue(perfectNumber.checkPerfectNumber(28));
        Assert.assertFalse(perfectNumber.checkPerfectNumber(1));
        Assert.assertFalse(perfectNumber.checkPerfectNumber(0));
        Assert.assertFalse(perfectNumber.checkPerfectNumber(99999996));
    }
}