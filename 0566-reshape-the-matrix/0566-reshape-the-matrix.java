class Solution {
    public int[][] matrixReshape(int[][] m, int r, int c) {
        int b[][]=new int[r][c];
        int nr=0,nc=0;
        int lr=m.length;
        int lc=m[0].length;
        int t=lr*lc;
        int nt=r*c;
        if(nt!=t){
            return m;
        }
        for(int i=0;i<lr;i++){
            for(int j=0;j<lc;j++){
                int d=m[i][j];
                if(nc>=c){
                    nr++;
                    nc=0;
                }
                b[nr][nc++]=d;
                
            }
        }
        return b;
    }
}