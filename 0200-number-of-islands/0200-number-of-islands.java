class Solution {
    public int c=0;
    public int numIslands(char[][] g) {
        int m=g.length;
        int n=g[0].length;
        boolean v[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]=='1'&&!v[i][j]){
                    dfs(g,i,j,v);
                    c++;
                }
            }
        }
        return c;
    }
    public void dfs(char[][]g,int i,int j,boolean[][]v){
        if(i<0||j<0||i>=g.length||j>=g[0].length||v[i][j]){
            return ;
        }
        v[i][j]=true;
        
       
        if(g[i][j]=='0'){
            return;
            
        }
        
        dfs(g,i-1,j,v);
        dfs(g,i,j-1,v);
        dfs(g,i,j+1,v);
        dfs(g,i+1,j,v);
       
    }
}