package MultifimentionalDP;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solved(obstacleGrid, 0, 0, m, n, dp);
    }

    public int solved(int[][] grid, int i, int j, int m, int n, int[][] dp) {
        if (i == m && j == n)
            return 1;
        if (i >= m || j >= n || grid[i][j] == 1)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int right = solved(grid, i + 1, j, m, n, dp);
        int down = solved(grid, i, j + 1, m, n, dp);
        return dp[i][j] = right + down;
    }
}
