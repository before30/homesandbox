package cc.before30.algex.string;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-morse-code-words/
 *
 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {

        String[] map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> wordsSet = new HashSet<>();

        for (String word : words) {
            String result = "";
            for (int i = 0; i < word.length(); i++) {
                result += map[word.charAt(i) - 'a'];
            }
            wordsSet.add(result);
        }
        return wordsSet.size();
    }
}
