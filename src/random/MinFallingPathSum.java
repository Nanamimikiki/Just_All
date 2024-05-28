package random;

public class MinFallingPathSum {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        if (n == 0) {
            return 0;
        }
        int[][] dp = new int[n][grid[0].length];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = grid[i][j];
                } else {
                    int min = Integer.MAX_VALUE;
                    for (int k = 0; k < grid[0].length; k++) {
                        if (k != j) {
                            min = Math.min(min, dp[i - 1][k]);
                        }
                    }

                    dp[i][j] = grid[i][j] + min;
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < grid[0].length; j++) {
            ans = Math.min(ans, dp[n - 1][j]);
        }

        return ans;
    }
}
