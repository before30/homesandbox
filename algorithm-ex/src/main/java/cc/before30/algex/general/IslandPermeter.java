package cc.before30.algex.general;

public class IslandPermeter {
    public int islandPerimeter(int[][] grid) {
        int width = grid[0].length;
        int height = grid.length;
        int sum = 0;
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if (grid[h][w] == 1) {
                    sum += permiter(h, w, grid);
                }
            }
        }

        return sum;
    }

    public int permiter(int i, int j, int[][] grid) {
        // North
        int north = 1;
        if (i-1 >= 0 && grid[i-1][j] == 1) {
            north = 0;
        }

        // South
        int south = 1;
        if (i+1 < grid.length && grid[i+1][j] == 1) {
            south = 0;
        }

        // East
        int east = 1;
        if (j+1 < grid[0].length && grid[i][j+1] == 1) {
            east = 0;
        }
        // West
        int west = 1;
        if (j-1 >= 0 && grid[i][j-1] == 1) {
            west = 0;
        }
        return north + south + east + west;
    }
}
