package cc.before30.algex.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * IntersectionOfTwoArrays
 *
 * @author before30
 * @since 2019-06-16
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> resultSet = new HashSet<>();

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            int n1 = nums1[i];
            int n2 = nums2[j];
            if (n1 > n2) {
                j++;
            } else if (n1 < n2) {
                i++;
            } else {
                resultSet.add(n1);
                i++;
                j++;
            }
        }

        return resultSet.stream().mapToInt(x -> x).toArray();
    }
}
