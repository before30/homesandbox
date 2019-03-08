package cc.before30.algex.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KClosestPoint {
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
