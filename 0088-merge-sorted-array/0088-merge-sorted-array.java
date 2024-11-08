class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(j>=0){
           if(i>=0&&n1[i]>n2[j]){
            n1[k--]=n1[i--];
           }
           else{
            n1[k--]=n2[j--];
           }
        }
        
    }
}