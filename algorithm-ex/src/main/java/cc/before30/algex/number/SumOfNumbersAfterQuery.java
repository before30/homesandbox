package cc.before30.algex.number;

import java.util.Arrays;

public class SumOfNumbersAfterQuery {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = Arrays.stream(A).sum();

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i][1];
            int acc = queries[i][0];

            if (A[idx] % 2 == 0) {
                sum -= A[idx];
            }
            A[idx] += acc;
            if (A[idx] % 2 == 0) {
                sum += A[idx];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public int sumEven(int[] list) {
        return Arrays.stream(list).filter(i -> i % 2 == 0).sum();
    }
}
