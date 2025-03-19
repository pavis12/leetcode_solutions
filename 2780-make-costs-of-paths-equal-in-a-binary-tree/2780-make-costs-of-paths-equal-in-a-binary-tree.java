class Solution {
    int a=0;
    public int minIncrements(int n, int[] c) {
        d(1,c,n);
        return a;
    }
    public int d(int i,int []c,int n){
        if(i*2>n) return c[i-1];
        int l=d(2*i,c,n);
        int r=d(2*i+1,c,n);
        a+=Math.abs(l-r);
        return Math.max(l,r)+c[i-1];
    }

}