class Solution {
    public int change(int amount, int[] coins) {
        // Create a DP array where dp[i] represents the number of ways to make up amount i.
        int[] dp = new int[amount + 1];
        dp[0] = 1; // There is one way to make amount 0, by using no coins.
        
        // Iterate over each coin.
        for (int coin : coins) {
            // Update the DP array for all amounts that can include this coin.
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        
        // The answer is the number of ways to make the full amount.
        return dp[amount];
    }
}
