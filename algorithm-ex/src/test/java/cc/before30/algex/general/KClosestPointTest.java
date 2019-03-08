package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KClosestPointTest {

    /**
     * Input: points = [[1,3],[-2,2]], K = 1
     * Output: [[-2,2]]
     *
     * Input: points = [[3,3],[5,-1],[-2,4]], K = 2
     * Output: [[3,3],[-2,4]]
     */
    @Test
    public void kClosest() {
        KClosestPoint closest = new KClosestPoint();
        int[][] points1 = new int[][] {{1,3}, {-2,2}};
        int[][] output1 = new int[][] {{-2,2}};

        int[][] points2 = new int[][] {{3,3}, {5,-1}, {-2,4}};
        int[][] output2 = new int[][] {{3,3}, {-2,4}};

        Assert.assertTrue(Arrays.deepEquals(output1, closest.kClosest(points1, 1)));
        Assert.assertTrue(Arrays.deepEquals(output2, closest.kClosest(points2, 2)));

    }
}