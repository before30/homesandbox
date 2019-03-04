package cc.before30.algex.general;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/
 *
 */
public class LRUIICache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUIICache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        // 있으면 Least 영역으로 바꾸기
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        // Capacity가 넘어가면 하나 삭제하고 추가하기
        // 중간에 있더라도 한번에 찾을 수 있어햔다.
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
