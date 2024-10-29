class Solution {
    public int missingNumber(int[] n) {
        List<Integer> l=new ArrayList<>();
        for(int i:n){
            l.add(i);
        }
        for(int i=0;i<=n.length;i++){
            if(!l.contains(i))return i;
        }
        return n.length;
    }
}