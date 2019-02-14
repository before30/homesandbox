package cc.before30.algex.string;

/**
 * https://leetcode.com/problems/binary-gap/
 */
public class BinaryGap {
    public int binaryGap(int N) {
        if (N == 0)
            return 0;
        String str = Integer.toBinaryString(N);
        int maxGap = 0;
        int gap = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                maxGap = Math.max(maxGap, gap);
                gap = 1;
            } else {
                gap++;
            }
        }
        return maxGap;
    }

    public int binaryGap2(int N) {
        int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < 32; ++i)
            if (((N >> i) & 1) != 0)
                A[t++] = i;

        int ans = 0;
        for (int i = 0; i < t - 1; ++i)
            ans = Math.max(ans, A[i+1] - A[i]);
        return ans;
    }
}
