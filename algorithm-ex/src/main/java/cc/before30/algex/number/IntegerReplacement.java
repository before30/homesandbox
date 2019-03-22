package cc.before30.algex.number;

public class IntegerReplacement {
    public int integerReplacement(int n) {

        return solve(n, 0);
    }

    public int solve(int n, int acc) {
        if ( n == 1 ) {
            return acc;
        }

        if ( n % 2 == 0 ) {
            return solve(n / 2, acc + 1);
        } else {
            return Math.min(solve(n - 1, acc + 1), solve(n + 1, acc + 1));
        }
    }
}
