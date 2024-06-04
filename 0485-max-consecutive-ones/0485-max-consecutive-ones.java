class Solution {
    public int findMaxConsecutiveOnes(int[] n) {
        int l=0;
        int c=0;
        for(int i:n){
            if(i==0){
                l=Math.max(l,c);
                c=0;
            }
            else {
                c++;
            }
        }
        l=Math.max(l,c);
        return l;
    }
}