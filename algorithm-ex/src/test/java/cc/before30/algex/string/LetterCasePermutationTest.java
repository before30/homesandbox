package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LetterCasePermutationTest {

    @Test
    public void letterCasePermutation() {
        LetterCasePermutation permutation = new LetterCasePermutation();

        List<String> output1 = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
        List<String> output2 = Arrays.asList("3z4", "3Z4");
        List<String> output3 = Arrays.asList("12345");

        Assert.assertTrue(isSameArray(output1, permutation.letterCasePermutation("a1b2")));
        Assert.assertTrue(isSameArray(output2, permutation.letterCasePermutation("3z4")));
        Assert.assertTrue(isSameArray(output3, permutation.letterCasePermutation("12345")));

    }

    public boolean isSameArray(List<String> arg1, List<String> arg2) {
        if (arg1.size() != arg2.size()) {
            return false;
        }

        for (String str : arg1) {
            if (!arg2.contains(str)) {
                return false;
            }
        }

        return true;
    }
}