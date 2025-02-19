class Solution {
    private int count = 0;
    private String result = null;

    public String getHappyString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        backtrack(n, k, sb, '\0');
        return result == null ? "" : result;
    }

    private void backtrack(int n, int k, StringBuilder sb, char lastChar) {
        if (sb.length() == n) {
            count++;
            if (count == k) {
                result = sb.toString();
            }
            return;
        }

        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (ch == lastChar) continue; // Ensure adjacent characters are different
            sb.append(ch);
            backtrack(n, k, sb, ch);
            sb.deleteCharAt(sb.length() - 1); // Backtrack
            if (result != null) return; // Stop once we find the k-th string
        }
    }
}
