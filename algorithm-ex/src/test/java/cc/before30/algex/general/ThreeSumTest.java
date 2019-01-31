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
        Assert.assertEquals(2, threeSum.threeSum(input).size());
        List<Integer> answer_list01 = Arrays.asList(-1, 0, 1);
        List<Integer> answer_list02 = Arrays.asList(-1, -1, 2);

        List<List<Integer>> lists = threeSum.threeSum(input);
        Assert.assertTrue(compareList(lists.get(0), answer_list01));
        Assert.assertTrue(compareList(lists.get(1), answer_list02));
    }

    public boolean compareList(List<Integer> listA, List<Integer> listB) {
        if (Objects.isNull(listA) || Objects.isNull(listB)) {
            return false;
        }

        return listA.containsAll(listB) && listB.containsAll(listA);
    }

}