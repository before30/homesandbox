package cc.before30.algex.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/?fbclid=IwAR3Lu-jN3zZceS56Ol83JrglOKMWMmPy5KjUQrL6RpA9wCeawY1jE5t-fWM
 *
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * Example 1:
 *
 * Input:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 *
 * Input:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 *
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;


        ArrayList<Integer> result = new ArrayList<>();
        //i, j -> i , j+1 // 0
        //i, j -> i+1, j // 1
        //i, j -> i, j-1 // 2
        //i, j -> i-1, j // 3


        return Arrays.asList(1);
    }
}
