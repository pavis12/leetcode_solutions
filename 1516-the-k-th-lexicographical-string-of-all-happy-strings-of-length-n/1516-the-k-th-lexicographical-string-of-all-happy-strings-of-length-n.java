class Solution {
    private int count = 0;
    private String result = "";
    
    public String getHappyString(int n, int k) {
        generateHappyString(n, "", k);
        return result;
    }

    private void generateHappyString(int n, String current, int k) {
        if (current.length() == n) {
            count++;
            if (count == k) {
                result = current;
            }
            return;
        }
        
        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (!current.isEmpty() && current.charAt(current.length() - 1) == ch) {
                continue;
            }
            generateHappyString(n, current + ch, k);
            if (!result.isEmpty()) return; // Stop recursion if the result is found
        }
    }
}
