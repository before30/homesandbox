package cc.before30.algex.general;

import java.util.*;
import java.util.stream.Collectors;

public class KClosestPoint {

    public int[][] kClosest2(int[][] points, int K) {
        SortedMap<Integer, int[]> map = new TreeMap<>();

        for (int i = 0; i < points.length; i++) {
            map.put(dist(points[i]), points[i]);
        }

        int[][] ans = new int[K][2];
        Set<Map.Entry<Integer, int[]>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, int[]>> i = entries.iterator();

        int t = 0;
        while(i.hasNext()) {
            if (t >= K) {
                break;
            }
            Map.Entry<Integer, int[]> val = i.next();
            ans[t++] = val.getValue();
        }

        return ans;
    }

    public int[][] kClosest(int[][] points, int K) {

        List<Integer> collect = Arrays.stream(points).map(point ->
           dist(point)
        ).collect(Collectors.toList());

        collect.sort(Comparator.comparingInt(o -> o));
        int dist = collect.get(K - 1);

        int[][] ans = new int[K][2];
        int j = 0;

        for (int i = 0; i < points.length; i++) {
            if (dist(points[i]) <= dist) {
                ans[j++] = points[i];
            }
        }

        return ans;
    }

    public int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
