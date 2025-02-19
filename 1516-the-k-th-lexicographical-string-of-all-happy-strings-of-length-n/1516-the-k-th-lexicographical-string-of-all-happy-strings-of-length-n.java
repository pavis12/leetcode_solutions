class Solution {
    public String getHappyString(int n, int k) {
        List<String> l=new ArrayList<>();
        f(n,"",l);
        if(l.size()<k)return "";
        Collections.sort(l);
        return l.get(k-1);
    }
    public void f(int n,String g,List<String> l){
        if(g.length()==n){
            l.add(g);
            return;
        }
        for(char i='a';i<='c';i++){
            if(g.length()>0&&g.charAt(g.length()-1)==i)continue;
            f(n,g+i,l);
        }
    }
}