class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int m=(n*(n+1))/2;
        int s=0;
        for(int i:nums){
            s+=i;
        }
        return m-s;
    }
}