package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecorderLogFilesTest {

    @Test
    public void reorderLogFiles() {

        RecorderLogFiles recorder = new RecorderLogFiles();

        String[] input1 = {"ab1 off key dog", "a8 act zoo", "g1 act car"};
        String[] input2 = {"a1 9 2 3 1", "zo4 4 7"};
        String[] input3 = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};

        String[] output1 = {"g1 act car","a8 act zoo","ab1 off key dog"};
        String[] output2 = {"a1 9 2 3 1","zo4 4 7"};
        String[] output3 = {"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};

        Assert.assertTrue(isSameStringArray(output1, recorder.reorderLogFiles(input1)));
        Assert.assertTrue(isSameStringArray(output2, recorder.reorderLogFiles(input2)));
        Assert.assertTrue(isSameStringArray(output3, recorder.reorderLogFiles(input3)));
    }

    public boolean isSameStringArray(String[] arg1, String[] arg2) {
        if (arg1.length != arg2.length) {
            return false;
        }

        for (int i = 0; i < arg1.length; i++) {
            if (!arg1[i].equals(arg2[i])) {
                return false;
            }
        }

        return true;
    }
}