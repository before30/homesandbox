package cc.before30.algex.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class VowelSpellCheckerII {

    Set<String> wordSet;
    HashMap<String, String> capitalizationMap;
    HashMap<String, String> vowelMap;

    public String[] spellchecker(String[] wordlist, String[] queries) {
        wordSet = new HashSet<>();
        capitalizationMap = new HashMap<>();
        vowelMap = new HashMap<>();

        for (String word : wordlist) {
            wordSet.add(word);
            capitalizationMap.putIfAbsent(word.toLowerCase(), word);
            vowelMap.putIfAbsent(deVowelString(word.toLowerCase()), word);
        }

        int idx = 0;
        String[] ans = new String[queries.length];
        for (String query : queries) {
            ans[idx++] = solve(query);
        }
        return ans;
    }

    public String solve(String query) {

        // 1 exact match case
        if (wordSet.contains(query)) {
            return query;
        }

        // 2 Capitalization match case
        if (capitalizationMap.containsKey(query.toLowerCase())) {
            return capitalizationMap.get(query.toLowerCase());
        }

        // 3 Vowel Errors case
        if (vowelMap.containsKey(deVowelString(query.toLowerCase()))) {
            return vowelMap.get(deVowelString(query.toLowerCase()));
        }

        return "";
    }

    public String deVowelString(String arg) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < arg.length(); i++) {
            buffer.append(isVowel(arg.charAt(i)) ? "*" : arg.charAt(i));
        }

        return buffer.toString();
    }

    public boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
            return true;
        }

        return false;
    }
}
