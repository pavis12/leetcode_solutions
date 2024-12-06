class Solution {
    public int[][] floodFill(int[][] m, int sr, int sc, int c) {
        
        int st=m[sr][sc];
        f(m,sr,sc,c,st);
        return m;

    }
    public void f(int[][] m, int sr, int sc, int c,int st){
        if(sr<0||sc<0||sr>=m.length||sc>=m[0].length||m[sr][sc]==c||m[sr][sc]!=st){
            return;
        }
        m[sr][sc]=c;
        f(m,sr+1,sc,c,st);
        f(m,sr-1,sc,c,st);
        f(m,sr,sc-1,c,st);
        f(m,sr,sc+1,c,st);
        return;
    }
}