class Solution {
    public int[][] modifiedMatrix(int[][] m) {
        int r=m.length;
        int c=m[0].length;
        int d[]=new int[c];
        int[][] n=new int[r][c];
        for(int i=0;i<c;i++){
            int l=-1;
            for(int j=0;j<r;j++){
                if(m[j][i]>l){
                    l=m[j][i];
                }
            }
            d[i]=l;
        }
        for(int i=0;i<c;i++){
            
            for(int j=0;j<r;j++){
                if(m[j][i]==-1){
                    n[j][i]=d[i];
                }
                else{
                    n[j][i]=m[j][i];
                }
            }
        }
        return n;
    }
}