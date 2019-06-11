package cc.before30.algex.string;

/**
 * VerifyingAlienDictionary
 *
 * @author before30
 * @since 2019-06-12
 */
public class VerifyingAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        if (words.length <= 1) {
            return true;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!isLexicographicalOrder(words[i], words[i+1], order)) {
                return false;
            }
        }

        return true;
    }

    private boolean isLexicographicalOrder(String u, String v, String order) {
        int minSize = Math.min(u.length(), v.length());
        for (int i = 0; i < minSize; i++) {
            int uIndex = order.indexOf(u.charAt(i));
            int vIndex = order.indexOf(v.charAt(i));
            if (uIndex > vIndex) {
                return false;
            } else if (uIndex < vIndex) {
                return true;
            }
        }

        return false;
    }
}
