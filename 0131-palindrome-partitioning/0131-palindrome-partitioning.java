class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> c=new ArrayList<>();
        sub(s,0,s.length()-1,c,res);
        return res;
    }
    public void sub(String s,int ind,int st,List<String> c,List<List<String>> res){
        if(ind==st+1){
            res.add(new ArrayList<>(c));
            return;
        }
        for(int i=ind;i<=st;i++){
            if(isp(s,ind,i)){
                String h=s.substring(ind,i+1);
                c.add(h);
                sub(s,i+1,st,c,res);
                c.remove(c.size()-1);
            }
        }
    }
    public boolean isp(String s,int st,int e){
        while(st<=e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}