package cc.before30.algex.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersactionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> rval = new ArrayList<>();

        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                rval.add(nums1[i]);
                i++;
                j++;

            }
        }

        return rval.stream().mapToInt(x -> x).toArray();
    }
}
