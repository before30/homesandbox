package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsomorphicTest {

    Isomorphic isomorphic;

    @Before
    public void init() {
        isomorphic = new Isomorphic();
    }

    @Test
    public void isIsomorphic() {
        /**
         * Input: s = "egg", t = "add"
         * Output: true
         */

        Assert.assertEquals(true, isomorphic.isIsomorphic("egg", "add"));
        /**
         * Input: s = "foo", t = "bar"
         * Output: false
         */
        Assert.assertEquals(false, isomorphic.isIsomorphic("foo", "bar"));

        /**
         * Input: s = "paper", t = "title"
         * Output: true
         */
        Assert.assertEquals(true, isomorphic.isIsomorphic("paper", "title"));
    }
}