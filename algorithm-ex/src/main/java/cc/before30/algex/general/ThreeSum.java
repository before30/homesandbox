package cc.before30.algex.general;

import java.util.*;

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

        Arrays.sort(nums);
        HashSet<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = find(-1 * (nums[i] + nums[j]), nums);
                if (k != -1 && k != i && k != j) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    list.sort((x,y) -> x - y);
                    resultSet.add(list);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> item: resultSet){
            result.add(item);
        }

        return result;
    }

    private int find(int num, int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int m = lo + (hi - lo) / 2;
            if (nums[m] > num) {
                hi = m - 1;
            } else if (nums[m] < num) {
                lo = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }

}
