package cc.before30.algex.array;

/**
 * ShortestUnsortedContinousSubarray
 *
 * @author before30
 * @since 2019-06-16
 */
public class ShortestUnsortedContinousSubarray {

    public int findUnsortedSubarray(int [] nums) {

        int preIdx = 0;
        int postIdx = -1;

        for (int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = i + 1; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
            }

            if (nums[i] > min) {
                preIdx = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < i; j++) {
                max = Math.max(max, nums[j]);
            }

            if (nums[i] < max) {
                postIdx = i;
                break;
            }
        }

        return postIdx - preIdx + 1;
    }
}
