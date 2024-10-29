class Solution {
    public void moveZeroes(int[] n) {
        int i=0,j=0;
        while(j<n.length){
            if(n[j]!=0){
                int t=n[j];
                n[j]=n[i];
                n[i]=t;
                i++;
            }
            j++;
        }
    }
}