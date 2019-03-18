package cc.before30.algex.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortArrayByParityIITest {

    @Test
    public void sortArrayByParityII() {
        int[] input = {4, 2, 5, 7};
        int[] output = {4, 7, 2, 5};

        SortArrayByParityII parity = new SortArrayByParityII();
        System.out.println(parity.sortArrayByParityII(input));
        Assert.assertTrue(Arrays.equals(output, parity.sortArrayByParityII(input)));

    }
}