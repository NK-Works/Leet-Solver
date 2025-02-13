class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int row, int col, int commonCount) {
        if (word.length() == commonCount) {
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(commonCount)) {
            return false;
        }
        char te = board[row][col];
        board[row][col] = '*';

        boolean foundMatch = dfs(board, word, row + 1, col, commonCount + 1) || 
        dfs(board, word, row - 1, col, commonCount + 1) ||
        dfs(board, word, row, col + 1, commonCount + 1) ||
        dfs(board, word, row, col - 1, commonCount + 1);

        board[row][col] = te;
        return foundMatch;
    }
}