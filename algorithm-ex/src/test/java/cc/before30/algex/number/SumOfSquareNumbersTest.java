package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfSquareNumbersTest {

    @Test
    public void judgeSquareSum() {
        SumOfSquareNumbers sum = new SumOfSquareNumbers();
        Assert.assertTrue(sum.judgeSquareSum(5));
        Assert.assertFalse(sum.judgeSquareSum(3));
    }
}