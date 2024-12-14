class Solution {
    public int rob(int[] n) {
        int d[]=new int[n.length];
        Arrays.fill(d,-1);
        return f(n,n.length-1,d);
        
    }
    public int f(int []n,int i,int []d){
        if(i<0)return 0;
        if(i==0)return n[0];
        if(d[i]!=-1)return d[i];
        int l=n[i]+f(n,i-2,d);
        int r=f(n,i-1,d);
        return d[i]=Math.max(l,r);


    }
}