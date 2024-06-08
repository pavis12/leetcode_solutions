class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(c);
        sub(c,0,c.length-1,new ArrayList<>(),res,t);
        return res;
    }
    public void sub(int[] n,int l,int r,List<Integer> c,List<List<Integer>> res, int t){
        if(t==0){
        res.add(new ArrayList<>(c));
        }
        for(int i=l;i<=r;i++){
            if(i!=l&&n[i]==n[i-1])continue;
            if(n[i]<=t){
                c.add(n[i]);
                sub(n,i+1,r,c,res,t-n[i]);
                c.remove(c.size()-1);
            }
            //sub(n,i+1,r,c,res,t);
        }
        
    }
}