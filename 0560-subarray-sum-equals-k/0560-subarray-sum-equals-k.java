class Solution {
    public int subarraySum(int[] n, int k) {
        int c=0,s=0;
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        for(int i:n){
            s+=i;
            if(m.containsKey(s-k))c+=m.get(s-k);
            m.put(s,m.getOrDefault(s,0)+1);
        }
        return c;
    }
}