package cc.before30.algex.array;

import java.util.Arrays;

public class MergeSortedArray {
    /**
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     *
     * Output: [1,2,2,3,5,6]
     *
     * 1, 2, 5, 7, 0, 0
     * 2, 3, 4
     *
     * 1, 2, 2, 3, 4, 5, 7
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        for (int i = 0; i < m; i++) {
            result[i] = nums1[i];
        }

        for (int i = m; i < m+n; i++) {
            result[i] = nums2[i-m];
        }

        Arrays.sort(result);

        for (int i = 0; i < m+n; i++) {
            nums1[i] = result[i];
        }
    }


}
