class Solution {
    public void rotate(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j){
                    continue;
                }
                else if(i<j){
                    int t=m[i][j];
                    m[i][j]=m[j][i];
                    m[j][i]=t;
                }
            }
        }
        for(int r[]:m){
            rev(r);
        }
    }
    public void rev(int a[]){
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
}