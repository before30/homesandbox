package cc.before30.algex.string;

import java.util.HashMap;
import java.util.Objects;

/***
 *
 * https://leetcode.com/problems/isomorphic-strings/?fbclid=IwAR3l_A8cVzQSUwB-T-dPqP7RA0_bfUI9Xry_OPgNkTw1UVlFBkn4SNe3Iwc
 *
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 *
 */
public class Isomorphic {

    public boolean isIsomorphic2(String s, String t) {
        if (Objects.isNull(s) || Objects.isNull(t)) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if (map.containsKey(s1)){
                if (map.get(s1) != t1) {
                    return false;
                }
            } else {
                if (map.containsValue(t1)) {
                    return false;
                }
                map.put(s1, t1);
            }

        }

        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        return mapToNumber(s).equals(mapToNumber(t));
    }

    public String mapToNumber(String arg) {
        HashMap<Character, Integer> map = new HashMap<>();
        int index = 0;
        String result = "";
        for (int i=0; i<arg.length(); i++) {
            if (Objects.isNull(map.get(arg.charAt(i)))) {
                index++;
                map.put(arg.charAt(i), index);
                result = result + index;
            } else {
                result = result + map.get(arg.charAt(i));
            }
        }

        return result;
    }
}
