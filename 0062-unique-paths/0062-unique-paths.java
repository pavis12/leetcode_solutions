class Solution {
    public int uniquePaths(int m, int n) {
        int d[][]=new int[m][n];
        for(int []r:d){
            Arrays.fill(r,-1);
        }
        return find(m-1,n-1,d);
        
    }
    public int find(int i,int j,int [][]d){
        if(i==0&&j==0){
            
            return 1;
        }
        if(i<0||j<0){
            return 0;
        }
        if(d[i][j]!=-1){
            return d[i][j];
        }
        int l=find(i,j-1,d);
        int t=find(i-1,j,d);
        d[i][j]=l+t;
        return d[i][j];
    } 
}