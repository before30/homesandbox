package cc.before30.algex.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void permute() {
        Permutation permutation = new Permutation();

//        int[] input1 = {1}; // -> [ [1] ] 1
        int[] input2 = {1,2}; // -> [ [1,2], [2,1] ] 2
        int[] input3 = {1,2,3}; // -> [ [] [] [] [] [] [] ] 6
        int[] input4 = {1, 2, 3, 4}; // 24

//        Assert.assertEquals(1, permutation.permute(input1).size());
        Assert.assertEquals(2, permutation.permute(input2).size());
        Assert.assertEquals(6, permutation.permute(input3).size());
        Assert.assertEquals(24, permutation.permute(input4).size());
    }
}