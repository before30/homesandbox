package cc.before30.algex.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++ ) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println("num[" + i + "]:" + nums[i] +"+num["+j+"]:"+nums[j] + "+num[" + k +"]:"+nums[k]);
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
//        List<Integer> answer_list01 = Arrays.asList(-1, 0, 1);
//        List<Integer> answer_list02 = Arrays.asList(-1, -1, 2);
//        result.add(answer_list01);
//        result.add(answer_list02);

        return result;
    }

}
