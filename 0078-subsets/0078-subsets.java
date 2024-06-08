class Solution {
    public List<List<Integer>> subsets(int[] n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        sub(n,0,n.length-1,c,res);
        return res;
    }
    public void sub(int[] n,int l,int r,List<Integer> c,List<List<Integer>> res){
        if(l>r){
            res.add(new ArrayList<>(c));
            return;
        }
        c.add(n[l]);
        sub(n,l+1,r,c,res);
        c.remove(c.remove(c.size()-1));
        sub(n,l+1,r,c,res);

    }
}