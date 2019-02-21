package cc.before30.algex.string;

/**
 * https://leetcode.com/problems/to-lower-case/
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

                result += (char)(str.charAt(i) + 32);
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println((int)'A' + ":" + (int)'a');
    }
}
