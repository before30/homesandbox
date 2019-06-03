package cc.before30.algex.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void climbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        Assert.assertEquals(1, climbingStairs.climbStairs(0));
        Assert.assertEquals(2, climbingStairs.climbStairs(2));
        Assert.assertEquals(3, climbingStairs.climbStairs(3));
        Assert.assertEquals(5, climbingStairs.climbStairs(4));
    }
}