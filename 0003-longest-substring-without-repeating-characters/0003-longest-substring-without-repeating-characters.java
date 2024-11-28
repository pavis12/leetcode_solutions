import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int l = s.length();
        Map<Character, Integer> m = new HashMap<>();
        int ma = 0;

        while (i < l) {
            char t = s.charAt(i);
            m.put(t, m.getOrDefault(t, 0) + 1);

            // If the frequency of the character exceeds 1, shrink the window
            while (m.get(t) > 1) {
                char leftChar = s.charAt(j);
                m.put(leftChar, m.get(leftChar) - 1);
                j++;
            }

            // Calculate the maximum length
            ma = Math.max(ma, i - j + 1);
            i++;
        }

        return ma;
    }
}
