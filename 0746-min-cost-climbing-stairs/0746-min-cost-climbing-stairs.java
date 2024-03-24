class Solution {
    public int minCostClimbingStairs(int[] c) {
        int n=c.length;
        int d[]=new int[n+1];
        Arrays.fill(d,-1);
        return find(n,d,c);
    }
    public int find(int n,int []d,int[]c){
        if(n==0||n==1){
            return 0;
        }
        if(d[n]!=-1){
            return d[n];
        }
        int l=find(n-1,d,c)+c[n-1];
        int r=Integer.MAX_VALUE;
        if(n>1){
            r=find(n-2,d,c)+c[n-2];
        }
        d[n]=Math.min(l,r);
        return d[n];
    }
    
}