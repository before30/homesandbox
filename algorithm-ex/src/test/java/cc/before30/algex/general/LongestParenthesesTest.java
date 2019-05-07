package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestParenthesesTest {

    @Test
    public void longestValidParentheses() {
        LongestParentheses longestParentheses = new LongestParentheses();
        Assert.assertEquals(2, longestParentheses.longestValidParentheses("(()"));
        Assert.assertEquals(4, longestParentheses.longestValidParentheses(")()())"));
    }
}