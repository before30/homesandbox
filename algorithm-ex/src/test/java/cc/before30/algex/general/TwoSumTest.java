package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {

        TwoSum twoSum = new TwoSum();
        int[] input1 = {2,7,11,15};
        int[] output1 = {0, 1};

        Assert.assertTrue(Arrays.equals(output1, twoSum.twoSum(input1, 9)));
    }
}