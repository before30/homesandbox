package cc.before30.algex.search;

public class BinarySearch {
    public int search(int[] nums, int target) {

        int min = 0;
        int max = nums.length - 1;
        int mid = (min + max)/2;

        while (min <= max) {

            if (nums[mid] > target) {
                max = mid -1;
            } else if (nums[mid] < target) {
                min = mid + 1;
            } else {
                return mid;
            }
            mid = (min + max) / 2;
        }

        return -1;
    }
}
