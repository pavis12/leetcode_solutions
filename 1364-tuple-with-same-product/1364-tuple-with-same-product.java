class Solution {
    public int tupleSameProduct(int[] n) {
        int l=n.length;
        Map<Integer,Integer> m=new HashMap<>();
        int c=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int p=n[i]*n[j];
                if(m.containsKey(p)){
                    c+=8*m.get(p);
                }
                m.put(p,m.getOrDefault(p,0)+1);
            }
        }
        return c;
    }
}