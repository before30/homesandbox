package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumOfNumbersAfterQueryTest {

    /*
    Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
Output: [8,6,2,4]
     */
    @Test
    public void sumEvenAfterQueries() {
        int[] input = {1, 2, 3, 4};
        int[][] queries = {{1,0}, {-3,1}, {-4,0}, {2,3}};
        int[] output = {8,6,2,4};

        SumOfNumbersAfterQuery s = new SumOfNumbersAfterQuery();

        Assert.assertTrue(Arrays.equals(output, s.sumEvenAfterQueries(input, queries)));
    }
}