class Solution {
    public int maxSubarraySumCircular(int[] n) {
        int t=0;
        int cmin=0,cmax=0;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:n){
            t+=i;
            cmin+=i;
            min=Math.min(min,cmin);
            if(cmin>0)cmin=0;
            cmax+=i;
            max=Math.max(max,cmax);
            if(cmax<0)cmax=0;
        }
        return (max>0)?Math.max(max,t-min):max;
        
    }
}