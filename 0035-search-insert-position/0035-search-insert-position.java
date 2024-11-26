class Solution {
    public int searchInsert(int[] n, int t) {
        int l=0,h=n.length-1;
        int p=n.length;
        while(l<=h){
            int m=l+((h-l)/2);
            if(n[m]>=t){
                p=m;
                h=m-1;

            }
            else{
                l=m+1;
            }
        }
        return p;
    }
}