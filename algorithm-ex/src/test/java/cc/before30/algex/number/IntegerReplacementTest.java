package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerReplacementTest {

    @Test
    public void integerReplacement() {
        IntegerReplacement replacement = new IntegerReplacement();

        Assert.assertEquals(3, replacement.integerReplacement(8));
        Assert.assertEquals(4, replacement.integerReplacement(7));
    }
}