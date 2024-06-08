class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> res=new ArrayList<>();
        sub(c,0,c.length-1,new ArrayList<>(),res,t);
        return res;
    }
    public void sub(int[] n,int l,int r,List<Integer> c,List<List<Integer>> res, int t){
        if(l==r+1){
            if(t==0){
                res.add(new ArrayList<>(c));
            }
            return;
        }
        if(n[l]<=t){
            c.add(n[l]);
            sub(n,l,r,c,res,t-n[l]);
            c.remove(c.size()-1);
        }
        sub(n,l+1,r,c,res,t);
    }
}