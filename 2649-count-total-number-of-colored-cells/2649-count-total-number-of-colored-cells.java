class Solution {
    public long coloredCells(int n) {
        long s=1;
        if(n==1)return s;
        long k=4;
        for(int i=2;i<=n;i++){
            s+=k;
            k+=4;
        }
        return s;
    }
}