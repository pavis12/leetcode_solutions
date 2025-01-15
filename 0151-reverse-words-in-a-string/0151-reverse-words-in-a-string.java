class Solution {
    public String reverseWords(String s) {
        int l = s.length();
        String r = "";  // This will hold the final result
        String g = "";  // This will hold the current word being built
        
        for (int i = 0; i < l;) {
            char t = s.charAt(i);
            if (t == ' ') {
                if (!g.equals("")) {  // Only add non-empty words to the result
                    if (!r.equals("")) {
                        r = g + ' ' + r;  // Add the word to the beginning of the result
                    } else {
                        r = g;  // Initialize the result with the first word
                    }
                    g = "";  // Reset g for the next word
                }
                // Skip multiple spaces
                while (i < l && s.charAt(i) == ' ') {
                    i++;
                }
            } else {
                g += t;  // Build the current word
                i++;
            }
        }

        // Add the last word if any
        if (!g.equals("")) {
            if (!r.equals("")) {
                r = g + ' ' + r;
            } else {
                r = g;
            }
        }
        
        return r;  // Trim any extra spaces
    }
}
