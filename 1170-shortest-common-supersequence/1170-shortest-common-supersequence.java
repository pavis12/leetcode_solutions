class Solution {
    public String shortestCommonSupersequence(String t1, String t2) {
        int l1 = t1.length();
        int l2 = t2.length();
        int[][] t = new int[l1 + 1][l2 + 1];

        // Compute LCS length table
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (t1.charAt(i - 1) == t2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        // Construct the shortest common supersequence
        int i = l1, j = l2;
        StringBuilder sb = new StringBuilder();

        while (i > 0 || j > 0) {
            if (i > 0 && j > 0 && t1.charAt(i - 1) == t2.charAt(j - 1)) {
                sb.append(t1.charAt(i - 1));
                i--;
                j--;
            } else if (j > 0 && (i == 0 || t[i][j - 1] >= t[i - 1][j])) {
                sb.append(t2.charAt(j - 1));
                j--;
            } else {
                sb.append(t1.charAt(i - 1));
                i--;
            }
        }

        return sb.reverse().toString();
    }
}
