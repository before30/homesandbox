package cc.before30.algex.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * BestTimeToBuyStockTest
 *
 * @author before30
 * @since 2019-06-17
 */
public class BestTimeToBuyStockTest {

    @Test
    public void maxProfit() {

        BestTimeToBuyStock stcok = new BestTimeToBuyStock();
        Assert.assertEquals(5, stcok.maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0, stcok.maxProfit(new int[]{7,6,4,3,1}));

    }
}