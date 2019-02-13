package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToeplitzMatrixTest {

    @Test
    public void isToeplitzMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };

        ToeplitzMatrix t = new ToeplitzMatrix();
        Assert.assertTrue(t.isToeplitzMatrix(matrix));

        int[][] matrix1 = {
                {1, 2, 3, 4, 5}
        };

        Assert.assertTrue(t.isToeplitzMatrix(matrix1));

        int[][] matrix2 = {
                {1}
        };

        Assert.assertTrue(t.isToeplitzMatrix(matrix2));

        int[][] matrix3 = {
                {1, 2},
                {2, 2}
        };

        Assert.assertFalse(t.isToeplitzMatrix(matrix3));
    }

    @Test
    public void isSameDiagonal() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };

        ToeplitzMatrix t = new ToeplitzMatrix();
        Assert.assertTrue(t.isSameDiagonal(matrix, 2, 0));
        Assert.assertTrue(t.isSameDiagonal(matrix, 1, 0));
        Assert.assertTrue(t.isSameDiagonal(matrix, 0, 0));
        Assert.assertTrue(t.isSameDiagonal(matrix, 0, 1));
        Assert.assertTrue(t.isSameDiagonal(matrix, 0, 2));
        Assert.assertTrue(t.isSameDiagonal(matrix, 0, 3));

    }
}