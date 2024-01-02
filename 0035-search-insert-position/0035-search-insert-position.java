class Solution {
    public int searchInsert(int[] n, int t) {
        int s=0,e=n.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(n[m]==t)return m;
            else if(n[m]>t) e=m-1;
            else s=m+1;
        }
        return s;
    }
}