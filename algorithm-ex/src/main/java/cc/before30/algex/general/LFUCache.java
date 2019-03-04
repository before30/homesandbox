package cc.before30.algex.general;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LFUCache {

    HashMap<Integer, Integer> cache;
    LinkedList<Integer> keyList;
    final int capacity;

    public LFUCache(int capacity) {
        this.cache = new HashMap<>(capacity);
        this.keyList = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        // 사용되는 것을 옮긴다.
        if (keyList.contains(key)) {
            keyList.remove(Integer.valueOf(key));
            keyList.addLast(key);

            return cache.get(key);
        }

        return -1;
    }

    public void put(int key, int value) {
        if (keyList.size() >= capacity) {
            try {
                Integer removedKey = keyList.removeFirst();
                cache.remove(Integer.valueOf(removedKey));
            } catch (NoSuchElementException ex) {

            }
        }

        keyList.addFirst(key);
        cache.put(key, value);

    }

}
