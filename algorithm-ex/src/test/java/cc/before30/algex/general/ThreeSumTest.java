package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * https://leetcode.com/problems/3sum/
 *
 * Given an array nums of n integers, are there elements a, b, c in nums
 * such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        ThreeSum threeSum = new ThreeSum();

        int[] input = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum.threeSum(input));
        Assert.assertEquals(2, threeSum.threeSum(input).size());

        int[] input2 = {3,-2,0,9,-10,6,-5,-3,-5,-3,9,-3,4,4,-6,-1,8,9,-2,-6,5,-8,6};
        Arrays.sort(input2);
        Arrays.stream(input2).forEach(System.out::println);
        System.out.println(threeSum.threeSum(input2));
        Assert.assertEquals(17, threeSum.threeSum(input2).size());
    }

    public boolean compareList(List<Integer> listA, List<Integer> listB) {
        if (Objects.isNull(listA) || Objects.isNull(listB)) {
            return false;
        }

        return listA.containsAll(listB) && listB.containsAll(listA);
    }

}