class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l=new ArrayList<>();
        b(1,n,k,new ArrayList<>(),l);
        return l;
    }
    public void b(int s, int n, int k, List<Integer> c, List<List<Integer>> r){
        if(c.size()==k){
            r.add(new ArrayList<>(c));
        }
        for(int i=s;i<=n;i++){
            c.add(i);
            b(i+1,n,k,c,r);
            c.remove(c.size()-1);
        }
    }
}