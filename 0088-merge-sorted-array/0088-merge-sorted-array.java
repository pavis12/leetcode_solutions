class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int k=0;
        int l=n1.length;
        for(int i=m;i<m+n;i++){
            n1[i]=n2[k++];
        }
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(n1[i]>n1[j]){
                    int t=n1[i];
                    n1[i]=n1[j];
                    n1[j]=t;
                }
            }
        }
    }
}