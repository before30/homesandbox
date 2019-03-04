package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LFUCacheTest {

    @Test
    public void lfuCacheTest() {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(1, cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        Assert.assertEquals(-1, cache.get(2));       // returns -1 (not found)
        Assert.assertEquals(3, cache.get(3));       // returns 3.
        cache.put(4, 4);    // evicts key 1.
        Assert.assertEquals(-1, cache.get(1));       // returns -1 (not found)
        Assert.assertEquals(3, cache.get(3));       // returns 3
        Assert.assertEquals(4, cache.get(4));       // returns 4
    }

    @Test
    public void test2() {
        LFUCache cache = new LFUCache(0);
        cache.put(0,0);
        cache.get(0);
    }

    @Test
    public void test3() {
        LFUCache cache = new LFUCache(2);
        cache.put(3,1);
        cache.put(2,1);
        cache.put(2,2);
        cache.put(4,4);
        Assert.assertEquals(2, cache.get(2));
    }
}