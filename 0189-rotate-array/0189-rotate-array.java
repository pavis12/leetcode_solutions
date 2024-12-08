class Solution {
    public void rotate(int[] n, int k) {
        int l=n.length;
        k=k%l;
        r(n,0,l-1);
        r(n,0,k-1);
        r(n,k,l-1);
    }
    public void r(int []n,int s,int e){
        while(s<e){
            int t=n[s];
            n[s]=n[e];
            n[e]=t;
            s++;
            e--;
        }
    }
}