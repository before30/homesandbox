package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example 1:
 *
 * Input: ["a","b","c","a","c","c"]
 * Output: 3
 * Explanation: 3 groups ["a","a"], ["b"], ["c","c","c"]
 * Example 2:
 *
 * Input: ["aa","bb","ab","ba"]
 * Output: 4
 * Explanation: 4 groups ["aa"], ["bb"], ["ab"], ["ba"]
 * Example 3:
 *
 * Input: ["abc","acb","bac","bca","cab","cba"]
 * Output: 3
 * Explanation: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
 * Example 4:
 *
 * Input: ["abcd","cdab","adcb","cbad"]
 * Output: 1
 * Explanation: 1 group ["abcd","cdab","adcb","cbad"]
 */
public class GroupsOfEquivalentStringTest {

    @Test
    public void groupsOfEStesat() {
        String[] input1 = {"a","b","c","a","c","c"};
        String[] input2 = {"aa","bb","ab","ba"};
        String[] input3 = {"abc","acb","bac","bca","cab","cba"};
        String[] input4 = {"abcd","cdab","adcb","cbad"};

        GroupsOfEquivalentString s = new GroupsOfEquivalentString();
        Assert.assertEquals(3, s.numSpecialEquivGroups(input1));
        Assert.assertEquals(4, s.numSpecialEquivGroups(input2));
        Assert.assertEquals(3, s.numSpecialEquivGroups(input3));
        Assert.assertEquals(1, s.numSpecialEquivGroups(input4));
    }

}