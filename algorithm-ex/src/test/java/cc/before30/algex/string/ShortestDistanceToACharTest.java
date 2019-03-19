package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ShortestDistanceToACharTest {

    @Test
    public void shortestToChar() {
        ShortestDistanceToAChar shortest = new ShortestDistanceToAChar();
        int[] output = {3,2,1,0,1,0,0,1,2,2,1,0};


        Assert.assertTrue(Arrays.equals(output, shortest.shortestToChar("loveleetcode", 'e')));
    }
}