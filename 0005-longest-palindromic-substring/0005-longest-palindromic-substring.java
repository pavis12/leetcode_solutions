class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        // Step 1: Transform the string by adding '#' between characters
        StringBuilder t = new StringBuilder();
        t.append('#');
        for (char c : s.toCharArray()) {
            t.append(c).append('#');
        }

        int n = t.length(); // Transformed string length
        int[] p = new int[n]; // Array to store palindrome radius at each position
        int center = 0, right = 0, maxLen = 0, start = 0;

        // Step 2: Iterate through each character in transformed string
        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i; // Mirror position of i

            // If i is within the right boundary, use previously computed values
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Step 3: Expand around the center
            while (i - p[i] - 1 >= 0 && i + p[i] + 1 < n &&
                   t.charAt(i - p[i] - 1) == t.charAt(i + p[i] + 1)) {
                p[i]++;
            }

            // Step 4: Update center and right boundary
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Step 5: Track the longest palindrome
            if (p[i] > maxLen) {
                maxLen = p[i];
                start = (i - p[i]) / 2; // Convert transformed index to original index
            }
        }

        // Step 6: Extract and return the longest palindromic substring
        return s.substring(start, start + maxLen);
    }
}
