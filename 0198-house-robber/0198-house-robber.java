class Solution {
    public int rob(int[] n) {
        if(n.length<2)return n[0];
        int p2=Math.max(n[0],n[1]);
        int p1=n[0];
        for(int i=2;i<n.length;i++){
            int c=Math.max(p2,p1+n[i]);
            p1=p2;
            p2=c;
        }
        return p2;
    }
}