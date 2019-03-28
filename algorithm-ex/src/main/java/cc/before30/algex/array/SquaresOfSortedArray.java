package cc.before30.algex.array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A) {

        return Arrays.stream(A).map(x -> x*x).sorted().toArray();
    }
}
