class Solution {
    public boolean canMakeArithmeticProgression(int[] n) {
        Arrays.sort(n);
        int l=n.length;
        int d=n[0]-n[1];
        for(int i=0;i<l-1;i++){
            int h=n[i]-n[i+1];
            if(h!=d){
                return false;
            }
        }
        return true;
    }
}