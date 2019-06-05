package cc.before30.algex.dp;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int f1 = cost[0];
        int f2 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int f_current = cost[i] + Math.min(f1, f2);
            f1 = f2;
            f2 = f_current;
        }

        return Math.min(f1, f2);
    }
}
