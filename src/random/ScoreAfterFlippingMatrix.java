package random;

public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; ++i) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; ++j) {
                    grid[i][j] ^= 1;
                }
            }
        }
        int score = 0;
        for (int j = 0; j < n; ++j) {
            int count = 0;
            for (int[] ints : grid) {
                count += ints[j];
            }
            score += Math.max(count, m - count) * (1 << (n - j - 1));
        }
        return score;
    }
}
