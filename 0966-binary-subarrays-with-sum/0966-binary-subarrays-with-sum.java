class Solution {
    public int numSubarraysWithSum(int[] n, int g) {
        int l=n.length;
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int r=0,p=0;
        for(int i=0;i<l;i++){
            p+=n[i];
            r+=m.getOrDefault(p-g,0);
            m.put(p,m.getOrDefault(p,0)+1);
        }
        return r;
    }
}