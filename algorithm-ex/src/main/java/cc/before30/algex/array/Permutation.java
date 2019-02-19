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

    public List<List<Integer>> permute2(int[] nums) {
        result = new ArrayList<>();
        doPermute(nums, 0);
        return result;
    }

    public void doPermute(int[] nums, int s) {

        if (s == nums.length) {

//            for ( int i = 0; i < nums.length; i++) {
//                System.out.print(nums[i] + ",");
//            }
//            System.out.println();
        } else {
            for (int i = s; i < nums.length; i++) {
                //swap i, s
                int temp = nums[i];
                nums[i] = nums[s];
                nums[s] = temp;

                doPermute(nums, s + 1);

                temp = nums[i];
                nums[i] = nums[s];
                nums[s] = temp;
            }
        }
    }



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
