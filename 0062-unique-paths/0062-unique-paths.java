class Solution {
    public int s=0;
    public int uniquePaths(int m, int n) {
        
        int d[][]=new int[m][n];
        for(int r[]:d){
            Arrays.fill(r,-1);
        }
        return f(m,n,m-1,n-1,d);
        //return s;
    }
    public int f(int m,int n,int r,int c,int [][]d){
        if(r<0||c<0||r>=m||c>=n)return 0;
        if(d[r][c]!=-1)return d[r][c];
        if(r==0&&c==0){
            return 1;
        }
        int l=f(m,n,r-1,c,d);
        int ri=f(m,n,r,c-1,d);
        return d[r][c]=l+ri;
    }

}