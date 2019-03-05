package cc.before30.algex.recursion;

public class Countdown {

    public static void countdown(int arg) {
        System.out.println(arg);

        if (arg <= 0) {
            return;
        } else {
            countdown(arg - 1);
        }

    }

    public static int factorial(int arg) {
        if (arg == 1) {
            return 1;
        } else {
            return arg * factorial(arg - 1);
        }
    }

    public static void main(String[] args) {
        countdown(10);
        System.out.println(factorial(5));
    }
}
