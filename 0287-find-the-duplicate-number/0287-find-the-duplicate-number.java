class Solution {
    public int findDuplicate(int[] n) {
        for(int i=0;i<n.length;i++){
            int d=Math.abs(n[i])-1;
            if(n[d]>0){
                n[d]*=-1;
            }
            else{
                return Math.abs(n[i]);
            }
        }
        return n[n.length-1];
    }
}