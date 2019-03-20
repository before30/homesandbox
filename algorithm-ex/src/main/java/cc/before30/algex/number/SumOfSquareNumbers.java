package cc.before30.algex.number;

public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        for (int a = 0; a * a <= c; a++) {
            for (int b = 0; b * b <= c; b++) {
                if (a*a + b*b == c) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean solution2(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b)
                return true;
        }
        return false;
    }

    public boolean solution3(int c) {

        for (long a = 0; a * a <= c; a++) {
            int bSquare = c - (int)(a * a);
            if (binary_search(0, bSquare, bSquare)) {
                return true;
            }
        }
        return false;
    }

    public boolean binary_search(long s, long e, int n) {
        if (s > e) {
            return false;
        }

        long mid = s + (e - s) / 2;
        if (mid * mid == n) {
            return true;
        }
        if (mid * mid > n) {
            return binary_search(s, mid -1, n);
        }
        return binary_search(mid+1, e, n);
    }
}
