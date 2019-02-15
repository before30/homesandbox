package cc.before30.algex.general;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

    public int maxProfit2(int[] prices) {
        return calculateMax(prices, 0);
//        int maxProfit = 0;
//        int i = 0;
//        while (true) {
//            int[] result = maxProfitLocal(prices, i);
//            maxProfit += result[0];
//            if (result[1] == -1)
//                break;
//            i = result[1] + 1;
//        }
//
//        return maxProfit;
    }

    public int calculateMax(int[] prices, int start) {
        if (start > prices.length)
            return 0;

        int maxProfit = 0;

        for (int i = start; i < prices.length; i++) {
                maxProfit = Math.max(maxProfit, prices[i] - prices[start] + calculateMax(prices, i + 1));
        }

        return maxProfit;
    }


    public int[] maxProfitLocal(int[] prices, int start) {
        int minPirce = Integer.MAX_VALUE;
        int maxProfit = 0;
        int index = -1;

        for (int i = start; i < prices.length; i++) {
            minPirce = Math.min(minPirce, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPirce);
        }

        return new int[]{maxProfit, index};
    }
}
