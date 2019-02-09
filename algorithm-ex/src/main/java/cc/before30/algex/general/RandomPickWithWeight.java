package cc.before30.algex.general;

import java.util.ArrayList;
import java.util.Random;

/**
 * https://leetcode.com/problems/random-pick-with-weight/?fbclid=IwAR3ZV_o8V8hlTbdkd9NTHEei6feN5Egmwzm1z0XVKjmBzZp-fM6FzZfscoI
 *
 * 528. Random Pick with Weight
 * Medium
 *
 * 173
 *
 * 261
 *
 * Favorite
 *
 * Share
 * Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.
 *
 * Note:
 *
 * 1 <= w.length <= 10000
 * 1 <= w[i] <= 10^5
 * pickIndex will be called at most 10000 times.
 * Example 1:
 *
 * Input:
 * ["Solution","pickIndex"]
 * [[[1]],[]]
 * Output: [null,0]
 * Example 2:
 *
 * Input:
 * ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 * [[[1,3]],[],[],[],[],[]]
 * Output: [null,0,1,1,1,0]
 * Explanation of Input Syntax:
 *
 * The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array w. pickIndex has no arguments. Arguments are always wrapped with a list, even if there aren't any.
 */
public class RandomPickWithWeight {


    public static void main(String[] args) {
        int[] w = {1, 3, 4, 4};
        Solution s = new Solution(w);
        s.printSums();

        for (int i = 0; i < 10; i++ ) {
            System.out.println("index is " + s.pickIndex());
        }
    }
}

class Solution {
    int[] sums;

    public Solution(int[] w) {
        int sum = 0;
        sums = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            sums[i] = sum;
        }
    }

    public int pickIndex() {
        int max = sums[sums.length - 1];
        Random rand = new Random();
        int randomValue = rand.nextInt(max);

//        System.out.println("Randomvalue : " + randomValue);
        int left = 0;
        int right = sums.length - 1;

        while (left < right) {
            int m = (left + right) / 2;
            if (sums[m] <= randomValue) {
                left = m + 1;
            } else {
                right = m;
            }

        }

        return left;
    }


    public void printSums() {
        for (int i = 0; i < sums.length; i++) {
            System.out.println(i + " : " + sums[i]);
        }
    }
}

