package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingPositiveTest {

    @Test
    public void firstMissingPositive() {

        MissingPositive m = new MissingPositive();
        int[] input1 = {1, 2, 0};
        int[] input2 = {3, 4, -1, 1};
        int[] input3 = {7, 8, 9, 11, 12};
        int[] input4 = {1, 2, 3};

        Assert.assertEquals(3, m.firstMissingPositive(input1));
        Assert.assertEquals(2, m.firstMissingPositive(input2));
        Assert.assertEquals(1, m.firstMissingPositive(input3));
        Assert.assertEquals(4, m.firstMissingPositive(input4));
    }
}