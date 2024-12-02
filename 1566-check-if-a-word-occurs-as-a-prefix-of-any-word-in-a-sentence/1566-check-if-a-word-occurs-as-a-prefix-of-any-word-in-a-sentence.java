class Solution {
    public int isPrefixOfWord(String s, String w) {
        // Split the sentence into words
        String[] g = s.split(" ");
        
        // Iterate over each word
        for (int m = 0; m < g.length; m++) {
            String i = g[m];
            
            // Check if 'w' is a prefix of the current word
            int k = 0;
            while (k < w.length() && k < i.length() && w.charAt(k) == i.charAt(k)) {
                k++;
            }
            
            // If we've matched the entire length of 'w', return the 1-based index
            if (k == w.length()) {
                return m + 1;
            }
        }
        
        // If no word has 'w' as a prefix, return -1
        return -1;
    }
}
