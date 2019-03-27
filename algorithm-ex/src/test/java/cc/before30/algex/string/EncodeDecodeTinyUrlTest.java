package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeDecodeTinyUrlTest {

    @Test
    public void decode() {
        EncodeDecodeTinyUrl codec = new EncodeDecodeTinyUrl();

        Assert.assertEquals("https://leetcode.com/problems/design-tinyur", codec.decode(codec.encode("https://leetcode.com/problems/design-tinyur")));
    }
}