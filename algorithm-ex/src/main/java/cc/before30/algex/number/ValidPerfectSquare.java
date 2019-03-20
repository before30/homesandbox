package cc.before30.algex.number;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {

        if (num == 1) {
            return true;
        }

        for (int i = 0; i <= num/2; i++) {
            int iSquare = i * i;
            if (iSquare == num) {
                return true;
            } else if (iSquare > num) {
                return false;
            }

        }
        return false;
    }
}
