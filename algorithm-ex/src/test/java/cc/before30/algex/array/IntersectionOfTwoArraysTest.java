package cc.before30.algex.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * IntersectionOfTwoArraysTest
 *
 * @author before30
 * @since 2019-06-16
 */
public class IntersectionOfTwoArraysTest {

    @Test
    public void intersection() {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

        Assert.assertTrue(Arrays.equals(new int[]{2}, intersectionOfTwoArrays.intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        Assert.assertTrue(Arrays.equals(new int[]{4,9}, intersectionOfTwoArrays.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));


    }
}