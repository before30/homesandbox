package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SpiralMatrixTest {

    @Test
    public void spiralOrder() {

        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> output = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);

        Assert.assertTrue(isEqual(output, spiralMatrix.spiralOrder(input)));

        int[][] input2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        List<Integer> output2 = Arrays.asList(1,2,3,4,8,12,11,9,5,6,7);

        Assert.assertTrue(isEqual(output2, spiralMatrix.spiralOrder(input2)));
    }

    private boolean isEqual(List<Integer> x, List<Integer> y) {
        if (x.size() != y.size()) {
            return false;
        }

        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) != y.get(i))
                return false;
        }

        return true;
    }
}