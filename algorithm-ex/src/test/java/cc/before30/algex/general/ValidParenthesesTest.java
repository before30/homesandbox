package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void isValid() {

        ValidParentheses validParenthese = new ValidParentheses();
        Assert.assertTrue(validParenthese.isValid("()"));
        Assert.assertTrue(validParenthese.isValid("()[]{}"));
        Assert.assertFalse(validParenthese.isValid("(]"));
        Assert.assertFalse(validParenthese.isValid("([)]"));
        Assert.assertTrue(validParenthese.isValid("{[]}"));
    }
}