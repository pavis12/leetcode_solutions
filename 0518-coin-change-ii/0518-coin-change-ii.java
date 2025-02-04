class Solution {
    public int change(int a, int[] l) {
        /*int n = l.length;
        int t[][] = new int[n + 1][a + 1];

        // Initialize the first row (excluding t[0][0]) to a large value (infinity)
        for (int j = 1; j <= a; j++) {
            t[0][j] = 0;
        }

        // Initialize the first column: 0 amount requires 0 coins
        for (int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                if (l[i - 1] <= j) {
                    t[i][j] = t[i][j - l[i - 1]]+ t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][a] ;*/
        int dp[] = new int[a + 1];

        // Initialize dp array with a large value
        //Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 1; // Base case: 0 amount needs 0 coins

        // Iterate over each coin
        for (int coin : l) {
            for (int j = coin; j <= a; j++) {
                dp[j] = dp[j]+dp[j - coin];
            }
        }

        return dp[a];
    }
}