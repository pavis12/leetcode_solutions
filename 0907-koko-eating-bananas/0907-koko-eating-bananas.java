class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int l = 1, r = Integer.MAX_VALUE; // Fix right boundary
        while (l <= r) { // Corrected the loop condition
            int m = l + (r - l) / 2; // Corrected the calculation of mid-point
            int k = 0; // Total hours needed

            for (int i : p) {
                k += (i + m - 1) / m; // Calculate hours for each pile
            }

            if (k <= h) { 
                r = m - 1; // Try for a smaller speed
            } else {
                l = m + 1; // Try for a larger speed
            }
        }
        return l; // The left boundary will contain the minimum speed
    }
}
