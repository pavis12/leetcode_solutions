class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        f(n,0,0,l,"");
        return l;
    }
    public void f(int n,int o,int c,List<String> l,String s){
        if(o==c&&o+c==2*n){
            l.add(s);
            return;
        }
        if(o<n){
            f(n,o+1,c,l,s+"(");
        }
        if(c<o){
            f(n,o,c+1,l,s+")");
        }
    }
}