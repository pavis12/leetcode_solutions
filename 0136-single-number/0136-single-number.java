class Solution {
    public int singleNumber(int[] n) {
        int h=n[0];
        for(int i=1;i<n.length;i++){
            h=h^n[i];
        }
        return h;
    }
}