package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseballGameTest {

    @Test
    public void calPoints() {
        String[] input1 = {"5","2","C","D","+"};
        String[] input2 = {"5","-2","4","C","D","9","+","+"};

        BaseballGame baseballGame = new BaseballGame();
        Assert.assertEquals(30, baseballGame.calPoints(input1));
        Assert.assertEquals(27, baseballGame.calPoints(input2));
    }
}