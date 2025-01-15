class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length()) return false;

        int c[] = new int[26];

        // Count characters in the first string
        for (char i : s.toCharArray()) {
            c[i - 'a']++;
        }

        // Subtract counts using the second string
        for (char i : t.toCharArray()) {
            c[i - 'a']--;
            if (c[i - 'a'] < 0) return false; // Early exit if counts mismatch
        }

        // If all counts are zero, they are anagrams
        for (int i = 0; i < 26; i++) {
            if (c[i] != 0) return false;
        }

        return true;
    }
}
