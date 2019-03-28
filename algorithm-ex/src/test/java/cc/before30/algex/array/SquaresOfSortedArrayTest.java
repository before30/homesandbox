package cc.before30.algex.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SquaresOfSortedArrayTest {

    /**
     * Input: [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Example 2:
     *
     * Input: [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     */
    @Test
    public void sortedSquares() {
        int[] input1 = {-4, -1, 0, 3, 10};
        int[] output1 = {0, 1, 9, 16, 100};
        int[] input2 = {-7, -3, 2, 3, 11};
        int[] output2 = {4, 9, 9, 49, 121};

        SquaresOfSortedArray s = new SquaresOfSortedArray();
        Assert.assertTrue(Arrays.equals(output1, s.sortedSquares(input1)));
        Assert.assertTrue(Arrays.equals(output2, s.sortedSquares(input2)));
    }
}