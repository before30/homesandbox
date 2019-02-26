package cc.before30.algex.string;

import java.util.ArrayDeque;
import java.util.Deque;

/*
https://leetcode.com/problems/di-string-match/
 */
public class DIStringMatch {
    public int[] diStringMatch(String S) {

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < S.length() + 1; i++) {
            deque.add(i);
        }

        int[] result = new int[S.length()+1];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                result[i] = deque.pollFirst();
            } else if (S.charAt(i) == 'D') {
                result[i] = deque.pollLast();
            }
        }

        result[S.length()] = deque.getFirst();
        return result;
    }
}
