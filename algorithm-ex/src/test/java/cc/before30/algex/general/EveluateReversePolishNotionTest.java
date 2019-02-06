package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EveluateReversePolishNotionTest {

    @Test
    public void evalRPN() {
        EveluateReversePolishNotion eval = new EveluateReversePolishNotion();
        String[] input1 = {"4", "13", "5", "/", "+"};
        Assert.assertEquals(6, eval.evalRPN(input1));

        String[] input2 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Assert.assertEquals(22, eval.evalRPN(input2));

        String[] input3 = {"2", "1", "+", "3", "*"};
        Assert.assertEquals(9, eval.evalRPN(input3));

    }
}