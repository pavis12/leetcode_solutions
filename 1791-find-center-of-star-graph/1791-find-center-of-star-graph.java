class Solution {
    public int findCenter(int[][] e) {
        int p=0;
        int f=0;
        int c[]=new int [1000001];
        int m=0;
        int r=e.length;
        
        for(int i=0;i<r;i++){
           int c1=e[i][0];
            int c2=e[i][1];
            c[c1]++;
            c[c2]++;
            int g=Math.max(c1,c2);
            m=Math.max(m,g);
        }
        int nc=0,n=0;
        for(int i=1;i<=m;i++){
            if(nc<c[i]){
                n=i;
                nc=c[i];
            }
        }
        return n;
    }
}