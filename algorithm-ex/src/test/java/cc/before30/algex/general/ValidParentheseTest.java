package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParentheseTest {

    @Test
    public void isValid() {
        ValidParenthese validParenthese = new ValidParenthese();
        Assert.assertTrue(validParenthese.isValid("()"));
        Assert.assertTrue(validParenthese.isValid("()[]{}"));
        Assert.assertFalse(validParenthese.isValid("(]"));
        Assert.assertFalse(validParenthese.isValid("([)]"));
        Assert.assertTrue(validParenthese.isValid("{[]}"));
    }
}