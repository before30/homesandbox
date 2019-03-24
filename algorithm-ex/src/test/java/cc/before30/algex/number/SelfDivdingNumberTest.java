package cc.before30.algex.number;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 */
public class SelfDivdingNumberTest {

    @Test
    public void selfDividingNumbers() {
        SelfDivdingNumber d = new SelfDivdingNumber();
        List<Integer> output = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        List<Integer> temp = d.selfDividingNumbers(1, 22);
        Assert.assertTrue(Arrays.equals(output.toArray(), d.selfDividingNumbers(1,22).toArray()));

    }
}