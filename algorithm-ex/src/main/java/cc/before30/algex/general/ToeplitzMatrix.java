package cc.before30.algex.general;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/toeplitz-matrix/
 *
 * Input:
 * matrix = [
 *   [1,2,3,4],
 *   [5,1,2,3],
 *   [9,5,1,2]
 * ]
 * Output: True
 */
public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int x = m - 1;
        int y = 0;

        for (int i = 0; i < m  + n - 1; i++) {

//            System.out.println("x : " + x + ", y : " + y);
            if (!isSameDiagonal(matrix, x, y)) {
                return false;
            }
            if ( x - 1 >= 0) {
                x = x - 1;
            } else {
                y++;
            }
        }
        return true;
    }

    public boolean isSameDiagonal(int[][] matrix, int x, int y) {
        int m = matrix.length;
        int n = matrix[0].length;
        int expectedValue = matrix[x][y];

        while(x < m && y < n) {
            if (expectedValue != matrix[x][y])
                return false;
            x++;
            y++;
        }

        return true;
    }

    /**
     * Approach #2: Compare With Top-Left Neighbor [Accepted]
     * Intuition and Algorithm
     *
     * For each diagonal with elements in order a_1, a_2, a_3, \dots, a_ka
     * 1
     * ​
     *  ,a
     * 2
     * ​
     *  ,a
     * 3
     * ​
     *  ,…,a
     * k
     * ​
     *  , we can check a_1 = a_2, a_2 = a_3, \dots, a_{k-1} = a_ka
     * 1
     * ​
     *  =a
     * 2
     * ​
     *  ,a
     * 2
     * ​
     *  =a
     * 3
     * ​
     *  ,…,a
     * k−1
     * ​
     *  =a
     * k
     * ​
     *  . The matrix is Toeplitz if and only if all of these conditions are true for all (top-left to bottom-right) diagonals.
     *
     * Every element belongs to some diagonal, and it's previous element (if it exists) is it's top-left neighbor. Thus, for the square (r, c), we only need to check r == 0 OR c == 0 OR matrix[r-1][c-1] == matrix[r][c].
     *
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix2(int[][] matrix) {
        for (int r = 0; r < matrix.length; ++r)
            for (int c = 0; c < matrix[0].length; ++c)
                if (r > 0 && c > 0 && matrix[r-1][c-1] != matrix[r][c])
                    return false;
        return true;
    }

    /**
     * Approach #1: Group by Category [Accepted]
     * Intuition and Algorithm
     *
     * We ask what feature makes two coordinates (r1, c1) and (r2, c2) belong to the same diagonal?
     *
     * It turns out two coordinates are on the same diagonal if and only if r1 - c1 == r2 - c2.
     *
     * This leads to the following idea: remember the value of that diagonal as groups[r-c]. If we see a mismatch, the matrix is not Toeplitz; otherwise it is.
     */
    public boolean isToeplitzMatrix3(int[][] matrix) {
        Map<Integer, Integer> groups = new HashMap();
        for (int r = 0; r < matrix.length; ++r) {
            for (int c = 0; c < matrix[0].length; ++c) {
                if (!groups.containsKey(r-c))
                    groups.put(r-c, matrix[r][c]);
                else if (groups.get(r-c) != matrix[r][c])
                    return false;
            }
        }
        return true;
    }
}
