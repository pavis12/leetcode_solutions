class Solution {
    public int findCenter(int[][] e) {
        int c[]=new int[e.length+2];
        for(int i=0;i<e.length;i++){
            int u=e[i][0];
            int v=e[i][1];
            c[u]++;
            c[v]++;
        }
        for(int i=1;i<=e.length+1;i++){
            if(c[i]==e.length){
                return i;
            }
        }
        return 0;
    }
}