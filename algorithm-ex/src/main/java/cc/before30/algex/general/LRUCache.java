package cc.before30.algex.general;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/lru-cache/
 *
 * get(key) - Get the value(will always be positive) of the key if the key exists in the cache, otherwise return -1
 *
 * put(key, value) Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 */
public class LRUCache {

    HashMap<Integer, Integer> map;
    LinkedList<Integer> keys;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        keys = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!keys.contains(key)) {
            return -1;
        }


        keys.remove(Integer.valueOf(key));
        keys.addLast(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (keys.contains(key)) {
            keys.remove(Integer.valueOf(key));
            keys.addLast(key);
            map.remove(Integer.valueOf(key));
            map.put(key, value);
        } else {
            if (keys.size() >= capacity) {
                int rKey = keys.removeFirst();
                map.remove(Integer.valueOf(rKey));
            }

            map.put(key, value);
            keys.addLast(key);
        }
    }
}
