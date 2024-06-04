class Solution {
    public int longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        int[] count = new int[128]; // ASCII range for uppercase and lowercase letters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int i = 0; i < 128; i++) {
            if (count[i] % 2 == 0) {
                length += count[i];
            } else {
                length += count[i] - 1;
                oddFound = true;
            }
        }

        // If there was an odd count, we can add one character to the center of the palindrome
        if (oddFound) {
            length += 1;
        }

        return length;
    }
}
