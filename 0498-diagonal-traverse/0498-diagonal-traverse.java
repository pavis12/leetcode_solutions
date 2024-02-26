class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length,i=0,r=0,c=0;
        int a[]=new int[m*n];
        boolean up=true;
        while(r<m&&c<n){
            if(up){
                while(r>0&&c<n-1){
                    a[i++]=mat[r][c];
                    r--;
                    c++;
                }
                a[i++]=mat[r][c];
                if(c==n-1){
                    r++;
                }
                else{
                    c++;
                }
            }
            else{
                while(c>0&&r<m-1){
                    a[i++]=mat[r][c];
                    r++;
                    c--;
                }
                a[i++]=mat[r][c];
                if(r==m-1){
                    c++;
                }
                else{
                    r++;
                }
            }
            up=!up;
        }
        return a;
    }
}