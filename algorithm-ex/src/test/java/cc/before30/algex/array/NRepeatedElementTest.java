package cc.before30.algex.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NRepeatedElementTest {

    @Test
    public void repeatedNTimes() {
        NRepeatedElement element = new NRepeatedElement();
        int[] input1 = {1, 2, 3, 3};
        int[] input2 = {2,1,2,5,3,2};
        int[] input3 = {5,1,5,2,5,3,5,4};

        Assert.assertEquals(3, element.repeatedNTimes(input1));
        Assert.assertEquals(2, element.repeatedNTimes(input2));
        Assert.assertEquals(5, element.repeatedNTimes(input3));
    }
}