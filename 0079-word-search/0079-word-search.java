class Solution {
    public boolean exist(char[][] b, String w) {
        boolean v[][]=new boolean[b.length][b[0].length];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                char r=w.charAt(0);
                if(b[i][j]==r){
                    if(dfs(i,j,b,0,w,v)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(int i,int j,char[][] b,int k, String w,boolean [][]v){
        if(k==w.length()){
            return true;
        }
        if(i<0||j<0||i>=b.length||j>=b[0].length||v[i][j]||b[i][j]!=w.charAt(k)){
            return false;
        }
        
        v[i][j]=true;
        if(dfs(i+1,j,b,k+1,w,v)||dfs(i-1,j,b,k+1,w,v)||dfs(i,j-1,b,k+1,w,v)||dfs(i,j+1,b,k+1,w,v)){
            return true;
        }
        v[i][j]=false;
        return false;
        
    }
}