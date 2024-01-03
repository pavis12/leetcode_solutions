class Solution {
    public void moveZeroes(int[] n) {
        int g=-1;
        int j=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=0){
                n[j++]=n[i];
            }
        }
        while(j<n.length){
            n[j++]=0;
        }
        
    }
}