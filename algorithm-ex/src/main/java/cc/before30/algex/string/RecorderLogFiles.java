package cc.before30.algex.string;

import java.util.*;
import java.util.regex.Pattern;

/**
 * https://leetcode.com/problems/reorder-log-files/
 */
public class RecorderLogFiles {

    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
                String others1 = log1.substring(log1.indexOf(" "));
                String others2 = log2.substring(log2.indexOf(" "));

                return others1.compareTo(others2);
            }

            return isDigit1 ? (isDigit2? 0 : 1) : -1;
        });

        return logs;
    }


    public String[] reorderLogFiles2(String[] logs) {

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
