package cc.before30.algex.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    /**
     * Input: [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     */
    @Test
    public void moveZeroes() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] input = {0, 1, 0, 3, 12};
        int[] output = {1, 3, 12, 0, 0};
        Assert.assertTrue(isSameArray(output, moveZeroes.moveZeroes(input)));
    }

    private boolean isSameArray(int[] arg1, int[] arg2) {
        if (arg1.length != arg2.length)
            return false;

        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i] != arg2[i])
                return false;
        }

        return true;
    }
}