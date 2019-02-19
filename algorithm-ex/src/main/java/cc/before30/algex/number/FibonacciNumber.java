package cc.before30.algex.number;

public class FibonacciNumber {
    public int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        return fib(N-1) + fib(N-2);
    }

    public int tailFib(int n, int a, int b) {
        if (n == 0)
            return a;
        if (n == 1)
            return b;

        return tailFib(n-1, b, a + b);


    }
}
