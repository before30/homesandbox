package cc.before30.algex.string;

import java.util.*;
import java.util.regex.Pattern;

/**
 * https://leetcode.com/problems/reorder-log-files/
 */
public class RecorderLogFiles {

    public String[] reorderLogFiles(String[] logs) {

        List<String> alphabetricKeyList = new ArrayList<>();
        List<String> numericKeyList = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {
            String[] log = logs[i].split(" ");

            if (Pattern.matches("[0-9]+", log[1])) {
                numericKeyList.add(logs[i]);
            } else {
                alphabetricKeyList.add(logs[i]);
            }
        }

        Collections.sort(alphabetricKeyList, (arg1, arg2) -> {
            String arg1_others = arg1.substring(arg1.indexOf(" "));
            String arg2_others = arg2.substring(arg2.indexOf(" "));

            return arg1_others.compareTo(arg2_others);
        });


        String[] result = new String[logs.length];
        int idx = 0;
        for (String str : alphabetricKeyList) {
            result[idx] = str;
            idx++;

        }

        for (String str : numericKeyList) {
            result[idx] = str;
            idx++;
        }

        return result;
    }
}
