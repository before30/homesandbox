package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DIStringMatchTest {

    @Test
    public void diStringMatch() {
        DIStringMatch match = new DIStringMatch();
        int[] output1 = {0,4,1,3,2};
        Assert.assertTrue(isSameArray(output1, match.diStringMatch("IDID")));

        int[] output2 = {0,1,2,3};
        Assert.assertTrue(isSameArray(output2, match.diStringMatch("III")));

        int[] output3 = {3,2,0,1};
        Assert.assertTrue(isSameArray(output3, match.diStringMatch("DDI")));
    }

    public boolean isSameArray(int[] arg1, int[] arg2) {
        if (arg1 == null || arg2 == null || arg1.length != arg2.length) {
            return false;
        }

        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i] != arg2[i]) {
                return false;
            }
        }

        return true;
    }
}