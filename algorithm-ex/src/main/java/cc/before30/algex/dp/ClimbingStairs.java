package cc.before30.algex.dp;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return doClimbStairs(0, n, memo);
    }

    public int doClimbStairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }

        if (i == n) {
            return 1;
        }

        if (memo[i] > 0) {
            return memo[i];
        }

        memo[i] = doClimbStairs(i + 1, n, memo) + doClimbStairs(i + 2, n, memo);
        return memo[i];
    }
}
