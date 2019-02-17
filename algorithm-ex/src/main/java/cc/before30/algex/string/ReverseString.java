package cc.before30.algex.string;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int i, j = 0;

        for (i = 0, j = s.length - 1; i < (s.length / 2); i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }

    }
}
