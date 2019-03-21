package cc.before30.algex.number;

public class PowerOfTwo {
    public boolean solution1(int n) {
        if ( n <= 0 ) {
            return false;
        }

        while ( n % 2 == 0 ) {
            n = n / 2;
        }

        return n == 1;
    }

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
