package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

    @Test
    public void scenarioTest() {
        LRUCache cache = new LRUCache(2);

        cache.put(1,1);
        cache.put(2,2);
        Assert.assertEquals(1, cache.get(1));
        cache.put(3,3);
        Assert.assertEquals(-1, cache.get(2));
        cache.put(4,4);
        Assert.assertEquals(-1, cache.get(1));
        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(4, cache.get(4));

    }

    @Test
    public void scenarioTest2() {
        LRUCache cache = new LRUCache(2);

        cache.put(2,1);
        cache.put(2,2);
        Assert.assertEquals(2, cache.get(2)); // 2
        cache.put(1,1);
        cache.put(4,1);
        Assert.assertEquals(-1, cache.get(2)); // -1

    }
}