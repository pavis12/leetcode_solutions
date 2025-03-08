class Solution {
    public int minimumRecolors(String s, int k) {
        int w = 0, minW;
        
        // Count 'W' in the first window of size k
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'W') w++;
        }
        
        minW = w; // Store the initial minimum
        
        // Sliding window approach
        for (int i = k; i < s.length(); i++) {
            if (s.charAt(i) == 'W') w++;   // Add new character in the window
            if (s.charAt(i - k) == 'W') w--; // Remove old character from the window
            minW = Math.min(minW, w);      // Update the minimum count of 'W'
            if (minW == 0) return 0;       // If 0, no recoloring needed
        }
        
        return minW;
    }
}
