package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPerfectSquareTest {

    @Test
    public void isPerfectSquare() {
        ValidPerfectSquare square = new ValidPerfectSquare();

        Assert.assertTrue(square.isPerfectSquare(16));
        Assert.assertFalse(square.isPerfectSquare(14));
    }
}