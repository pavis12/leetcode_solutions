class Solution {
    public int maxSubArray(int[] n) {
        int a=Integer.MIN_VALUE;
        int s=0;
        for(int i:n){
            s+=i;
            a=Math.max(a,s);
            if(s<0){
                s=0;
            }
        }
        return a;
    }
}