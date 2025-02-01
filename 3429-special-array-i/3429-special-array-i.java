class Solution {
    public boolean isArraySpecial(int[] n) {
        for(int i=0;i<n.length-1;i++){
            if((n[i]%2==0&&n[i+1]%2==0)||(n[i]%2==1&&n[i+1]%2==1))return false;
        }
        return true;
    }
    
}