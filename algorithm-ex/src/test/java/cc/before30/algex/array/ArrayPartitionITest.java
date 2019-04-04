package cc.before30.algex.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayPartitionITest {

    @Test
    public void arrayPairSum() {

        ArrayPartitionI partitionI = new ArrayPartitionI();

        int[] input = {1,4,3,2};
        Assert.assertEquals(4, partitionI.arrayPairSum(input));

    }
}