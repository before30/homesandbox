package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumIITest {

    @Test
    public void twoSum() {
        TwoSumII twoSumII = new TwoSumII();
        int[] numbers = {2, 7, 11, 15};
        int[] output = {1,2};

        Assert.assertTrue(Arrays.equals(output, twoSumII.twoSum(numbers, 9)));
    }
}