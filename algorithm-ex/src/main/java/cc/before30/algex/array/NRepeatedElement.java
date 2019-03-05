package cc.before30.algex.array;

import java.util.HashSet;
import java.util.Set;

public class NRepeatedElement {
    public int repeatedNTimes(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i]))
                return A[i];
            else
                set.add(A[i]);
        }

        return -1;
    }
}
