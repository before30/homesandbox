package cc.before30.algex.number;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        if ( n == 1 ) {
            return true;
        }

        do {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        } while (n > 1);

        return true;
    }
}
