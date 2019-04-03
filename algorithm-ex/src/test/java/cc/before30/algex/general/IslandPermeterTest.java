package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IslandPermeterTest {
    /**
     * [[0,1,0,0],
     *  [1,1,1,0],
     *  [0,1,0,0],
     *  [1,1,0,0]]
     *
     * Output: 16
     */

    @Test
    public void islandPerimeter() {
        int[][] input =  {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };

        IslandPermeter i = new IslandPermeter();
        Assert.assertEquals(16, i.islandPerimeter(input));
    }
}