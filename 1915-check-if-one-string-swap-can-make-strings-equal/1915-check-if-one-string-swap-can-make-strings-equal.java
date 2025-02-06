class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        char c1 = '-';
        char c2 = '-';
        
        if (l1 != l2) return false;
        if (s1.equals(s2)) return true;
        
        int count = 0;
        int first = -1, second = -1;
        
        for (int i = 0; i < l1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) return false;
                if (count == 1) {
                    c1 = s1.charAt(i);
                    c2 = s2.charAt(i);
                    first = i;
                } else {
                    second = i;
                    if (s1.charAt(second) != c2 || s2.charAt(second) != c1) return false;
                }
            }
        }
        
        return count == 2;
    }
}
