package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringIITest {

    /**
     * \Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     */
    @Test
    public void reverseStr() {
        ReverseStringII r = new ReverseStringII();
        Assert.assertEquals("bacdfeg", r.reverseStr("abcdefg", 2));
    }
}