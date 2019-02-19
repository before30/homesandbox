package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {

    @Test
    public void fib() {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        Assert.assertEquals(1, fibonacciNumber.fib(2));
        Assert.assertEquals(2, fibonacciNumber.fib(3));
        Assert.assertEquals(3, fibonacciNumber.fib(4));
        Assert.assertEquals(5, fibonacciNumber.fib(5));
        Assert.assertEquals(8, fibonacciNumber.fib(6));
        Assert.assertEquals(13, fibonacciNumber.fib(7));
        Assert.assertEquals(21, fibonacciNumber.fib(8));
        Assert.assertEquals(832040, fibonacciNumber.fib(30));
        Assert.assertEquals(102334155, fibonacciNumber.fib(40));
    }
}