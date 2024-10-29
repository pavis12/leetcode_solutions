class Solution {
    public int findMaxConsecutiveOnes(int[] n) {
        int c=0;
        int m=0;
        for(int i:n){
            if(i==0){
                m=Math.max(m,c);
                c=0;
            }
            else c++;
        }
        m=Math.max(m,c);
        return m;
    }
}