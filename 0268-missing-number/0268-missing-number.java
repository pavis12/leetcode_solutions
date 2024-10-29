class Solution {
    public int missingNumber(int[] n) {
        int l=n.length;
        int s1=l*(l+1)/2;
        int s2=0;
        for(int i:n){
            s2+=i;
        }
        return s1-s2;
    }
}