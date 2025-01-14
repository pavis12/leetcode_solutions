class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // Only append if it's not the outermost '('
                if (openCount > 0) {
                    result.append(ch);
                }
                openCount++;
            } else {
                openCount--;
                // Only append if it's not the outermost ')'
                if (openCount > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
