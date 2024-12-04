class Pair{
    int r;
    int c;
    int time;
    Pair(int r,int c,int time){
        this.r=r;
        this.c=c;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] g) {
        Queue<Pair> q=new LinkedList<>();
        int m=g.length;
        int n=g[0].length;
        int c=0;
        int v[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]==2){
                    
                    q.add(new Pair(i,j,0));
                    v[i][j]=2;
                }
                else{
                    v[i][j]=0;
                }
                if(g[i][j]==1){
                    c++;
                }
            }
        }
        
        int t=0,cn=0;
        int dr[]={-1,0,+1,0};
        int dc[]={0,1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().r;
            int co=q.peek().c;
            int h=q.peek().time;
            t=Math.max(t,h);
            q.remove();
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=co+dc[i];
                if(nr>=0 && nc>=0 && nr<m && nc<n &&v[nr][nc]==0 && g[nr][nc]==1){
                    v[nr][nc]=1;
                    cn++;
                    q.add(new Pair(nr,nc,h+1));
                }
            }
        }
        if(cn!=c){
            return -1;
        }
        return t;
    }
}