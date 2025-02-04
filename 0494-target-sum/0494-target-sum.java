class Solution {
    public int findTargetSumWays(int[] a, int d) {
        int s = 0;
        for (int num : a) {
            s += num;
        }

        // If the required subset sum is not an integer, negative, or invalid, return 0
        if ((s + d) % 2 != 0 || s < Math.abs(d)) {
            return 0;
        }

        int s1 = (s + d) / 2;
        if (s1 < 0) {
            return 0; // Prevent negative array size
        }

        int l = a.length;

        // DP array for subset sum count
        int[] t = new int[s1 + 1];
        t[0] = 1; // One way to make sum 0 (empty subset)

        for (int num : a) {
            // Traverse in reverse to avoid using updated values
            for (int j = s1; j >= num; j--) {
                t[j] += t[j - num];
            }
        }

        return t[s1];

    }
}