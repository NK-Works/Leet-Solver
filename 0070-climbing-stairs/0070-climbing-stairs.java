class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return climbStairsHelper(n, dp);
    }

    public int climbStairsHelper(int n, int dp[]) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = climbStairsHelper(n-1, dp) + climbStairsHelper(n-2, dp);
        return dp[n];
    }
}