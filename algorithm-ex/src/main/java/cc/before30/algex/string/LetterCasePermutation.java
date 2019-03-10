package cc.before30.algex.string;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    List<String> ans;
    String s;
    public List<String> letterCasePermutation(String S) {
        this.ans = new ArrayList<>();
        this.s = S;

        recursive(0, "");
        return ans;
    }

    public void recursive(int idx, String tempStr) {
        if (idx == s.length()) {
            ans.add(tempStr);
        } else {
            char c = s.charAt(idx);
            if (c >= '0' && c <= '9') {
                recursive(idx+1, tempStr + c);
            } else {
                recursive(idx + 1, tempStr + ("" + c).toLowerCase());
                recursive(idx + 1, tempStr + ("" + c).toUpperCase());
            }
        }

    }
}
