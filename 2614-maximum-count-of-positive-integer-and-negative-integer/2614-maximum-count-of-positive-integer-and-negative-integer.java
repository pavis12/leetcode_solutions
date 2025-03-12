class Solution {
    public int maximumCount(int[] n) {
        int m=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<n.length;i++){
            if(n[i]==0)continue;
            if(n[i]<0){
                c++;
            }
            else{
                m=Math.max(c,n.length-i);
                return m;
            }
        }
        return c;
    }
}