class Solution {
    public int subarraySum(int[] n, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int s=0,c=0;
        m.put(0,1);
        for(int i:n){
            s+=i;
            if(m.containsKey(s-k))c+=m.get(s-k);
            m.put(s,m.getOrDefault(s,0)+1);
        }
        return c;
    }
}