class Solution {
    public int minPathSum(int[][] a) {
        int r=a.length;
        int c=a[0].length;
        int m[][]=new int[r][c];
        m[0][0]=a[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0&&j==0){
                    continue;
                }
                else if(i==0){
                    m[i][j]=m[i][j-1]+a[i][j];
                }
                else if(j==0){
                    m[i][j]=m[i-1][j]+a[i][j];
                }
                else{
                    int d=Math.min(m[i][j-1],m[i-1][j]);
                    m[i][j]=d+a[i][j];
                }
            }
        }
        return m[r-1][c-1];
    }
}