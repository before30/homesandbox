package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringIIITest {

    @Test
    public void reverseWords() {
        /**
         * Input: "Let's take LeetCode contest"
         * Output: "s'teL ekat edoCteeL tsetnoc"
         */

        ReverseStringIII r = new ReverseStringIII();
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", r.reverseWords("Let's take LeetCode contest"));
    }
}