package cc.before30.algex.number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SelfDivdingNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelftDivideNumber(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public boolean isSelftDivideNumber(int num) {
        String number = String.valueOf(num);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < number.length(); i++) {
            int n = Integer.parseInt(number.charAt(i) + "");
            if (n == 0) {
                return false;
            }
            set.add(n);
        }

        for (int n : set) {
            if (num % n != 0) {
                return false;
            }
        }

        return true;
    }
}
