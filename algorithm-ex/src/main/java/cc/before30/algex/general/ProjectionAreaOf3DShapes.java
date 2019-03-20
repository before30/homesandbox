package cc.before30.algex.general;

public class ProjectionAreaOf3DShapes {

    public int solution2(int[][] grid) {
        int N = grid.length;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int bestRow = 0;
            int bestCol = 0;

            for (int j = 0; j < N; j++) {
                if (grid[i][j] > 0) ans++;
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }

        return ans;
    }

    public int projectionArea(int[][] grid) {

        int xy = 0;
        int xz = 0;
        int yz = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    xy++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0;  j < grid[0].length; j++) {
                max = Math.max(max, grid[i][j]);
            }
            xz += max;
        }

        for (int j = 0; j < grid[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < grid.length; i++) {
                max = Math.max(max, grid[i][j]);
            }
            yz += max;
        }

        return xy + xz + yz;
    }
}
