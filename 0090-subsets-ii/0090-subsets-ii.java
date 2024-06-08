class Solution {
    public List<List<Integer>> subsetsWithDup(int[] n) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        Arrays.sort(n);
        sub(n,0,n.length-1,c,res);
        return res;
    }
    public void sub(int[] n,int l,int r,List<Integer> c,List<List<Integer>> res){
        res.add(new ArrayList<>(c));
        for(int i=l;i<=r;i++){
            if(i!=l&&n[i]==n[i-1])continue;
            c.add(n[i]);
            sub(n,i+1,r,c,res);
            c.remove(c.size()-1);
            
        }

    }
}