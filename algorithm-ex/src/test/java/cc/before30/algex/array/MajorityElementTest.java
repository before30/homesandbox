package cc.before30.algex.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void majorityElement() {
        MajorityElement majorityElement = new MajorityElement();
        int[] input = {3, 2, 3};
        Assert.assertEquals(3, majorityElement.majorityElement(input));

        int[] input2 = {2, 2, 1, 1, 1, 2, 2};
        Assert.assertEquals(2, majorityElement.majorityElement(input2));
    }
}