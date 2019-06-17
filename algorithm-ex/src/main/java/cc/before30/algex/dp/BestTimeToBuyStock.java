package cc.before30.algex.dp;

/**
 * BestTimeToBuyStock
 *
 * @author before30
 * @since 2019-06-17
 */
public class BestTimeToBuyStock {

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }
        return max >= 0 ? max : 0;
    }

    public int maxProfit2(int[] prices) {
        int localMin = Integer.MAX_VALUE;
        int localMax = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < localMin) {
                localMin = prices[i];
            } else {
                localMax = Math.max(localMax, prices[i] - localMin);
            }
        }

        return localMax >= 0 ? localMax : 0;
    }
}
