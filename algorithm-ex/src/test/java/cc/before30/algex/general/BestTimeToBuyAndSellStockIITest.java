package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockIITest {

    @Test
    public void maxProfit() {

        BestTimeToBuyAndSellStockII stock = new BestTimeToBuyAndSellStockII();
        int[] input1 = {7, 1, 5, 3, 6, 4};
        int[] input2 = {1, 2, 3, 4, 5};
        int[] input3 = {7, 6, 4, 3, 1};

        Assert.assertEquals(7, stock.maxProfit(input1));
        Assert.assertEquals(4, stock.maxProfit(input2));
        Assert.assertEquals(0, stock.maxProfit(input3));
    }
}