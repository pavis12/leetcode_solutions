class Solution {
    public int maxMoves(int[][] g) {
        int r = g.length;
        int c = g[0].length;
        
        // Initialize a memoization table with -1 (meaning uncomputed)
        int[][] memo = new int[r][c];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        int maxMoves = 0;

        // Try starting from every row in the first column
        for (int i = 0; i < r; i++) {
            maxMoves = Math.max(maxMoves, findMaxMoves(g, i, 0, memo));
        }

        return maxMoves;
    }

    // Recursive function with memoization
    public int findMaxMoves(int[][] g, int r, int c, int[][] memo) {
        // If we're at the last column, no more moves are possible
        if (c == g[0].length - 1) {
            return 0;
        }

        // If the result is already computed, return it from memo
        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int maxMovesFromHere = 0; // Track the maximum moves from this cell
        int p = g[r][c];  // Current cell value

        // Explore all valid moves to the next column
        if (r - 1 >= 0 && g[r - 1][c + 1] > p) {
            maxMovesFromHere = Math.max(maxMovesFromHere, 1 + findMaxMoves(g, r - 1, c + 1, memo));
        }
        if (g[r][c + 1] > p) {
            maxMovesFromHere = Math.max(maxMovesFromHere, 1 + findMaxMoves(g, r, c + 1, memo));
        }
        if (r + 1 < g.length && g[r + 1][c + 1] > p) {
            maxMovesFromHere = Math.max(maxMovesFromHere, 1 + findMaxMoves(g, r + 1, c + 1, memo));
        }

        // Store the result in the memo table
        memo[r][c] = maxMovesFromHere;
        return maxMovesFromHere;
    }
}
