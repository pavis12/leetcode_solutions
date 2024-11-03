class Solution {
    public void rotate(int[][] m) {
        int r=m.length;
        int c=m[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i<j){
                    int t=m[i][j];
                    m[i][j]=m[j][i];
                    m[j][i]=t;
                }
            }
        }
        for(int row[]:m){
            rev(row);
        }
        
    }
    public void rev(int []r){
        int i=0,j=r.length-1;
        while(i<j){
            int t=r[i];
            r[i]=r[j];
            r[j]=t;
            i++;
            j--;
        }
    }
}