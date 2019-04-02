package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NumberOfLinesToWriteStringTest {

    /**
     * [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
     * S = "abcdefghijklmnopqrstuvwxyz"
     * Output: [3, 60]
     *
     * widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
     * S = "bbbcccdddaaa"
     * Output: [2, 4]
     */
    @Test
    public void numberOfLines() {

        NumberOfLinesToWriteString n = new NumberOfLinesToWriteString();
        int[] widths1 = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        int[] output1 = {3, 60};

        int[] widths2 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s2 = "bbbcccdddaaa";
        int[] output2 = {2, 4};

        Assert.assertTrue(Arrays.equals(output1, n.numberOfLines(widths1, s1)));
        Assert.assertTrue(Arrays.equals(output2, n.numberOfLines(widths2, s2)));
    }
}