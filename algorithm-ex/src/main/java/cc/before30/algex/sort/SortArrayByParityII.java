package cc.before30.algex.sort;

import java.util.Arrays;

public class SortArrayByParityII {

    public int[] towPass(int[] A) {
        int n = A.length;
        int[] ans = new int[n];

        int idx = 0;
        for (int x : A) {
            if (x % 2 == 0) {
                ans[idx] = x;
                idx = idx + 2;
            }
        }

        idx = 1;
        for (int x : A) {
            if (x % 2 == 1) {
                ans[idx] = x;
                idx = idx + 2;
            }
        }

        return ans;
    }


    public int[] sortArrayByParityII(int[] A) {

        int[] temp = Arrays.stream(A).boxed().sorted((x, y) -> Integer.compare(x % 2, y % 2)).mapToInt(i -> i)
                .toArray();

        int[] ans = new int[A.length];
        for (int i = 0, j = A.length - 1, k = 0; i < (A.length)/2; i++, j--, k = k + 2) {
            ans[k] = temp[i];
            ans[k+1] = temp[j];
        }

        return ans;
    }
}
