class Solution {
    public int minOperations(int[] n, int k) {
        int c=0;
        for(int i:n){
            if(i<k){
                c++;
            }
        }
        return c;
        
    }
}