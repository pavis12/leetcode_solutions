class Solution {
    public int climbStairs(int n) {
        if(n==1||n==0){
            return n;
        }
        int d[]=new int[n+2];
        d[0]=d[1]=1;
        for(int i=2;i<=n+1;i++){
            d[i]=d[i-1]+d[i-2];

        }
        return d[n];
    }
}