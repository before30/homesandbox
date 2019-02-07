package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

        int[] input1 = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(5, stock.maxProfit(input1));

        int[] input2 = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, stock.maxProfit(input2));
    }

    @Test
    public void maxProfit2() {
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

        int[] input1 = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(5, stock.maxProfit2(input1));

        int[] input2 = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, stock.maxProfit2(input2));
    }
}