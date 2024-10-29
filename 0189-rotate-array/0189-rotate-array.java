class Solution {
    public void rotate(int[] n, int k) {
        int l=n.length;
        k=k%l;
        r(n,0,l-1);
        r(n,0,k-1);
        r(n,k,l-1);
    }
    public void r(int[]r,int s,int e){
        while(s<e){
            int t=r[s];
            r[s]=r[e];
            r[e]=t;
            s++;
            e--;
        }
    }
}