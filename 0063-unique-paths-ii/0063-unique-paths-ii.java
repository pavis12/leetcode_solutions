class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int m=o.length;
        int n=o[0].length;
        int d[][]=new int[m][n];
        for(int []r:d){
            Arrays.fill(r,-1);
        }
        return find(m-1,n-1,d,o);
    }
    public int find(int i,int j,int[][] d,int [][]o){
        if(i==0&&j==0){
            if(o[i][j]==0){
                return 1;
            }
            else{
                return 0;
            }
            
        }
        if(i<0||j<0||o[i][j]==1){
            return 0;
        }
        if(d[i][j]!=-1){
            return d[i][j];
        }
        int t=find(i-1,j,d,o);
        int l=find(i,j-1,d,o);
        d[i][j]=t+l;
        return d[i][j];
    }
}