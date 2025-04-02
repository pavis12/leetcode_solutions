class Solution {
    public long maximumTripletValue(int[] n) {
        int len = n.length;
        if (len < 3) return 0;
        
        int[] maxPrefix = new int[len];
        maxPrefix[0] = n[0];
        
        for (int i = 1; i < len; i++) {
            maxPrefix[i] = Math.max(maxPrefix[i - 1], n[i]);
        }
        
        long maxVal = 0;
        for (int j = 1; j < len - 1; j++) {
            if (maxPrefix[j - 1] > n[j]) { 
                for (int k = j + 1; k < len; k++) {
                    long val = (long) (maxPrefix[j - 1] - n[j]) * n[k];
                    maxVal = Math.max(maxVal, val);
                }
            }
        }
        
        return maxVal;
    }
}
