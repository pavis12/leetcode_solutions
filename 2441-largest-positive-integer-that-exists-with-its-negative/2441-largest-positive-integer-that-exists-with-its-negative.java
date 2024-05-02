class Solution {
    public int findMaxK(int[] n) {
        Arrays.sort(n);
        List<Integer>l=new ArrayList<>();
        for(int i:n){
            l.add(i);
        }
        for(int i=n.length-1;i>=0;i--){
            if(l.contains(-n[i])){
                return n[i];
            }
        }
        return -1;
        
    }
}