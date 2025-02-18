class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 1; i < rows; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        for (int j = 1; j < cols; j++) {
            grid[0][j] += grid[0][j - 1]; 
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[rows-1][cols-1];

        // int out = calculateMinPathSum(rows, cols, grid);
        // return out;
    }

    // public int calculateMinPathSum(int m, int n, int[][] matrix) {
    //     int dp[][] = new int[m][n];

        
    // }
}