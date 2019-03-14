package cc.before30.algex.sort;

import java.util.Arrays;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int[] even = Arrays.stream(A).filter(x -> x % 2 == 0).toArray();
        int[] odd = Arrays.stream(A).filter(x -> x % 2 == 1).toArray();

        int[] ans = new int[even.length + odd.length];
        for (int i = 0; i < even.length; i++) {
            ans[i] = even[i];
        }

        for (int i = 0; i < odd.length; i++) {
            ans[even.length + i] = odd[i];
        }

        return ans;
    }
}
