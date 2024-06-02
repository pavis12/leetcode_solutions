class Solution {
    public List<Integer> majorityElement(int[] n) {
        Map<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        int k=(int)Math.floor((double)n.length/3);
        for(int i:n){
            m.put(i,m.getOrDefault(i,0)+1);
            if(m.get(i)>k&&!l.contains(i)){
                l.add(i);
            }
            if(l.size()==2){
                return l;
            }
        }
        return l;
    }
}