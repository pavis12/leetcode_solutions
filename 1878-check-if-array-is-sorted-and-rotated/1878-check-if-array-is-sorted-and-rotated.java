class Solution {
    public boolean check(int[] n) {
        int l = n.length;
        int count = 0; // To count the number of decreasing points
        
        for (int i = 0; i < l; i++) {
            // Compare current element with the next (with wrap-around using modulo)
            if (n[i] > n[(i + 1) % l]) {
                count++;
            }
        }
        
        // If there is at most one decreasing transition, it's a rotated sorted array
        return count <= 1;
    }
}
