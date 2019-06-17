package cc.before30.algex.dp;

/**
 * MinCostClimbingStairs2
 *
 * @author before30
 * @since 2019-06-17
 */
public class MinCostClimbingStairs2 {

    public int minCostClimbingStairs(int[] cost) {

        int top = cost.length;
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= top; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }

        return dp[top];
    }
}
