class Solution {
    public int subarraysDivByK(int[] n, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int c=0,s=0;
        for(int i:n){
            s+=i;
            int g=s%k;
            if(g<0){
                g+=k;
            }
            if(m.containsKey(g)){
                c+=m.get(g);
                m.put(g,m.get(g)+1);
            }
            else{
                m.put(g,1);
            }

        }
        return c;
    }
}