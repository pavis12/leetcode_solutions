class Solution {
    public boolean containsNearbyDuplicate(int[] n, int k) {
        Map<Integer,List<Integer>> m=new HashMap<>();
        int l=n.length;
        for(int i=0;i<l;i++){
            List<Integer> p;
            if(m.containsKey(n[i])){
                p=m.get(n[i]);
               
            
            }
            else{
                p=new ArrayList<>();
            }
            p.add(i);
            m.put(n[i],p);
            
            
        }
        for(int i=0;i<l;i++){
            List<Integer> p=m.get(n[i]);
            for(Integer q:p){
                int d=Math.abs(i-q);
                if(d<=k&&i!=q){
                    return true;
                }
            }
        }
        return false;
    }
}