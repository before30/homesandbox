package cc.before30.algex.array;

public class MoveZeroes {

    /**
     * You must do this in-place without making a copy of the array.
     * Minimize the total number of operations.
     */
    public int[] moveZeroes(int[] nums) {

        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                countZero++;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = nums.length - countZero; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }

}
