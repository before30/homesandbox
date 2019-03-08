package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void missingNumber() {
        MissingNumber missingNumber = new MissingNumber();

        int[] input1 = {3, 0, 1};
        int[] input2 = {9,6,4,2,3,5,7,0,1};

        Assert.assertEquals(2, missingNumber.missingNumber(input1));
        Assert.assertEquals(8, missingNumber.missingNumber(input2));
    }
}