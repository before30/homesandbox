package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AssignCookiesTest
 *
 * @author before30
 * @since 2019-06-16
 */
public class AssignCookiesTest {

    @Test
    public void findContentChildren() {
        AssignCookies assignCookies = new AssignCookies();

        Assert.assertEquals(1, assignCookies.findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
        Assert.assertEquals(2, assignCookies.findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }
}