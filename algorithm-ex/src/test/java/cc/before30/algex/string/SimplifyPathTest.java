package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimplifyPathTest {

    @Test
    public void simplifyPath() {

        SimplifyPath path = new SimplifyPath();

        Assert.assertEquals("/home", path.simplifyPath("/home/"));
        Assert.assertEquals("/", path.simplifyPath("/../"));
        Assert.assertEquals("/home/foo", path.simplifyPath("/home//foo/"));
        Assert.assertEquals("/c", path.simplifyPath("/a/./b/../../c/"));
        Assert.assertEquals("/c", path.simplifyPath("/a/../../b/../c//.//"));
        Assert.assertEquals("/a/b/c", path.simplifyPath("/a//b////c/d//././/.."));
    }
}