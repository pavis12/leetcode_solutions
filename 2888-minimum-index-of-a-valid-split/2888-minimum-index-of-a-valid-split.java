class Solution {
    public int minimumIndex(List<Integer> n) {
        HashMap<Integer,Integer> m1= new HashMap<>();
        HashMap<Integer,Integer> m2= new HashMap<>();
        for(int i:n){
            m2.put(i,m2.getOrDefault(i,0)+1);
        }
        for(int i=0;i<n.size();i++){
            int l=n.get(i);
            m2.put(l,m2.get(l)-1);
            m1.put(l,m1.getOrDefault(l,0)+1);
            if(m1.get(l)*2>i+1&&m2.get(l)*2>n.size()-i-1)return i;
        }
        return -1;

    }
}