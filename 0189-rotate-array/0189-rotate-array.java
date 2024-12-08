class Solution {
    public void rotate(int[] n, int k) {
        int j=0;
        int p[]=new int [n.length];
        int m=n.length-k;
        for(int i=m;i<n.length;i++){
            p[j++]=n[i];

        }
        for(int i=0;i<m;i++){
            p[j++]=n[i];
        }
        for(int i=0;i<n.length;i++){
            n[i]=p[i];
        }
    }
}