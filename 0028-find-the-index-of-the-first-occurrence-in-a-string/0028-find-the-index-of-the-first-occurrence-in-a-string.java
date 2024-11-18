class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is an empty string, return 0 as per the problem statement
        if (needle.isEmpty()) {
            return 0;
        }

        int lh = haystack.length();
        int ln = needle.length();

        // If needle is longer than haystack, it cannot be a substring
        if (ln > lh) {
            return -1;
        }

        // Loop through the haystack
        for (int i = 0; i <= lh - ln; i++) {
            // Check if the substring of haystack starting at i matches needle
            if (haystack.substring(i, i + ln).equals(needle)) {
                return i; // Return the starting index
            }
        }

        // If no match is found, return -1
        return -1;
    }
}
