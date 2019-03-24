package cc.before30.algex.number;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        Set<Integer> divisors = new HashSet<>();
        if (num <= 0) {
            return false;
        }
        for (int i = 1; i <= num / 2 ;i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }

        return divisors.stream().mapToInt(x -> x).sum() == num;
    }
}
