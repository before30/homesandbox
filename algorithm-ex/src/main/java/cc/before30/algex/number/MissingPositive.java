package cc.before30.algex.number;

import java.util.HashSet;
import java.util.Set;

public class MissingPositive {

    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 1; i < nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
