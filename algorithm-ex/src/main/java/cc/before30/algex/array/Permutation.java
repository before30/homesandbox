package cc.before30.algex.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/
 */
public class Permutation {

    List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        permutation(nums, 0);

//        System.out.println("----");
//        result.stream().forEach(System.out::println);
        return result;
    }

    public void permutation(int[] nums, int start) {
        if (start > nums.length) {
            // add result
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }

            result.add(list);
            return;
        }

        permutation(nums, start + 1);
        for (int i = start + 1; i < nums.length; i++) {
            int[] clone = nums.clone();
            int tmp = clone[start];
            clone[start] = clone[i];
            clone[i] = tmp;
            permutation(clone, start + 1);
        }
    }


}
