package cc.before30.algex.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupsOfEquivalentString {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            String a = "" , b = "";
            for (int j = 0; j < A[i].length(); j++) {
                if (j % 2 == 0) {
                    a += A[i].charAt(j);
                } else {
                    b += A[i].charAt(j);
                }
            }

            char[] aChar = a.toCharArray();
            char[] bChar = b.toCharArray();
            Arrays.sort(aChar);
            Arrays.sort(bChar);
            String tmp = new String(aChar) + new String(bChar);
            set.add(tmp);
        }
        return set.size();
    }
}
