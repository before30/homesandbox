package cc.before30.algex.general;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i <= j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                return  new int[]{i+1, j+1};
            }
        }
        return null;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < numbers.length; i++) {
//            int x = target - numbers[i];
//            if (map.containsKey(x)) {
//                return new int[]{map.get(x) + 1, i + 1};
//            }
//
//            map.put(numbers[i], i);
//        }
//        return null;
    }

}
