package cc.before30.algex.general;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?fbclid=IwAR2jQWH3OMJQqxSZZTrhnJe1QiaRl6rNKQCtEl80i-6s07sJFKa3eS179uQ
 *
 * 121. Best Time to Buy and Sell Stock
 * Easy
 *
 * 2117
 *
 * 107
 *
 * Favorite
 *
 * Share
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //
        for (int i = 0; i < prices.length; i++) {
           minPrice = Math.min(minPrice, prices[i]);
           maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<prices.length-1; i++) {
            for (int j=i+1; j<prices.length; j++) {
                max = Math.max(prices[j] - prices[i], max);
            }
        }

        return max < 0 ? 0 : max;
    }
}
