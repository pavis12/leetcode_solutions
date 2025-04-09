class Solution {
    public int minOperations(int[] n, int k) {
        Set<Integer> s=new HashSet<>();
        for(int i:n){
            if(i<k){
                return -1;
            }
            else if(i>k){
                s.add(i);
            }
        }
        return s.size();
    }
}