class Solution {
    public int fib(int n) {
        int d[]=new int[n+2];
        d[0]=0;
        d[1]=1;
        for(int i=2;i<=n;i++){
            d[i]=d[i-1]+d[i-2];
        }
        return d[n];
    }
}