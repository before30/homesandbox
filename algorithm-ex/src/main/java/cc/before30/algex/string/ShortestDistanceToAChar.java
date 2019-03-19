package cc.before30.algex.string;

public class ShortestDistanceToAChar {

    public int[] shortestToCharII(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int prev = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }

    public int[] shortestToChar(String S, char C) {

        int[] ans = new int[S.length()];
        for(int i = 0; i < S.length(); i++) {
            ans[i] = Math.min(shortestDistance(S, C, i, -1), shortestDistance(S, C, i, 1));
        }

        return ans;
    }

    private int shortestDistance(String s, char c, int startIdx, int direction) {
        for (int i = startIdx; i < s.length() && i >= 0; i = i + direction) {
            if (s.charAt(i) == c) {
                return Math.abs(startIdx - i);
            }
        }

        return Integer.MAX_VALUE;
    }
}
