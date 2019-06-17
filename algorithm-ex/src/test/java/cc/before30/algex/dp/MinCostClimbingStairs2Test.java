package cc.before30.algex.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * MinCostClimbingStairs2Test
 *
 * @author before30
 * @since 2019-06-17
 */
public class MinCostClimbingStairs2Test {

    @Test
    public void minCostClimbingStairs() {

        MinCostClimbingStairs2 min2 = new MinCostClimbingStairs2();
        Assert.assertEquals(15, min2.minCostClimbingStairs(new int[]{10,15,20}));
        Assert.assertEquals(6, min2.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}