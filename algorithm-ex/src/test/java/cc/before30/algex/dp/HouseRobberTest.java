package cc.before30.algex.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * HouseRobberTest
 *
 * @author before30
 * @since 2019-06-17
 */
public class HouseRobberTest {

    @Test
    public void rob() {
        HouseRobber robber = new HouseRobber();
        Assert.assertEquals(4, robber.rob(new int[]{1,2,3,1}));
        Assert.assertEquals(12, robber.rob(new int[]{2,7,9,3,1}));
        Assert.assertEquals(2, robber.rob(new int[]{2,1}));
        Assert.assertEquals(4, robber.rob(new int[]{2,1,1,2}));

    }
}