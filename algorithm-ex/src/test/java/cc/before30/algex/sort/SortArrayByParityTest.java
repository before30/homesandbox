package cc.before30.algex.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortArrayByParityTest {

    @Test
    public void sortArrayByParity() {
        /**
         * Input: [3,1,2,4]
         * Output: [2,4,3,1]
         */

        int[] input = {3,1,2,4};
        int[] output = {2,4,3,1};

        SortArrayByParity parity = new SortArrayByParity();
        Assert.assertTrue(Arrays.equals(output, parity.sortArrayByParity(input)));
    }
}