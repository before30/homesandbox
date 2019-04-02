package cc.before30.algex.string;

public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {

        int[] ans = new int[2];
        int line = 0;
        int size = 100;

        for (int i = 0; i < S.length(); i++) {
            int idx = S.charAt(i) - 'a';
            if (size - widths[idx] < 0) {
                line++;
                size = 100 - widths[idx];
            } else {
                size -= widths[idx];
            }

        }

        ans[0] = line+1;
        ans[1] = 100 - size;
        return ans;
    }
}
