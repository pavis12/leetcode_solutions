class Solution {
    public int findCircleNum(int[][] c) {
        int n=c.length;
        int k=0;
        boolean v[]=new boolean[n];
        for(int i=0;i<n;i++){
            int p=0;
            if(!v[i]){
            v[i]=true;
            f(v,c,i);
            k++;
            }
        }
        return k;
        
    }
    public void f(boolean []v,int [][]c,int n){
        int l=c.length;
        for(int i=0;i<l;i++){
            if(c[n][i]==1&&!v[i]){
                v[i]=true;
                f(v,c,i);

            }
        }
    }
}