package cc.before30.algex.general;

import java.util.Arrays;

/**
 * AssignCookies
 *
 * @author before30
 * @since 2019-06-16
 */
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        // 두개의 Array를 소팅한다.
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int result = 0;
        while(i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                result++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return result;
    }
}
