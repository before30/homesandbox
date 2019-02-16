package cc.before30.algex.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class IntersactionOfTwoArraysIITest {

    @Test
    public void intersect() {
        IntersactionOfTwoArraysII intersaction = new IntersactionOfTwoArraysII();
        int[] input1 = {1,2,2,3};
        int[] input2 = {2, 2};
        int[] result1 = {2, 2};
        Assert.assertTrue(isSameArrray(result1, intersaction.intersect(input1, input2)));

        int[] input3 = {4,9,5};
        int[] input4 = {9,4,9,8,4};
        int[] result2 = {4, 9};
        Assert.assertTrue(isSameArrray(result2, intersaction.intersect(input3, input4)));

    }

    public boolean isSameArrray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            set.remove(array2[i]);
        }

        return set.size() == 0 ? true : false;
    }
}