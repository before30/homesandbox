package cc.before30.algex.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostClimbingStairsTest {

    @Test
    public void testMinCost() {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        Assert.assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(cost1));
        Assert.assertEquals(6, minCostClimbingStairs.minCostClimbingStairs(cost2));
    }

}