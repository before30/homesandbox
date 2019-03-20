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
        return false;
    }
}
