class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        return bin(m,0,m.length*m[0].length-1,t);
    }
    public boolean bin(int[][] m,int l,int h, int t){
        while(l<=h){
            int mid=(l+h)/2;
            int r=mid/m[0].length,c=mid%m[0].length;
            if(m[r][c]==t)return true;
            else if(m[r][c]>t)h=mid-1;
            else l=mid+1;
        }
        return false;
    }

}