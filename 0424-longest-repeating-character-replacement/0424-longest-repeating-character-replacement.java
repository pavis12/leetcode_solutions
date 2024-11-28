class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26]; // Frequency of each character in the window
        int maxFreq = 0; // Maximum frequency of a single character in the window
        int maxLength = 0; // Maximum length of the substring
        int j = 0; // Left pointer of the sliding window

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            charCount[currentChar - 'A']++; // Increment frequency for current character
            maxFreq = Math.max(maxFreq, charCount[currentChar - 'A']); // Update max frequency in window

            // Shrink the window if replacements exceed k
            while ((i - j + 1) - maxFreq > k) {
                charCount[s.charAt(j) - 'A']--; // Reduce frequency of leftmost character
                j++; // Move left pointer
            }

            // Update the maximum length of the valid window
            maxLength = Math.max(maxLength, i - j + 1);
        }

        return maxLength;
    }
}