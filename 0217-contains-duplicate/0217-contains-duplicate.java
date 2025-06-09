class Solution {
    public boolean containsDuplicate(int[] n) {
        Map<Integer,Integer> l=new HashMap<>();
        for(int i:n){
            if(l.containsKey(i))return true;
            l.put(i,1);
        }
        return false;
    }
}