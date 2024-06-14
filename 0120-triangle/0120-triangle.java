class Solution {
    int min=Integer.MAX_VALUE;
    public int minimumTotal(List<List<Integer>> t) {
        int m[][]=new int[t.size()][t.get(t.size()-1).size()];
        for(int r[]:m){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        return f(t,0,0,m);
        
    }
    public  int f(List<List<Integer>> t,int p,int r,int [][]m){
        if(r==t.size()){
            return 0;
        }
        if(m[r][p]!=Integer.MAX_VALUE)return m[r][p];
        int res=Math.min(f(t,p,r+1,m),f(t,p+1,r+1,m));
        return m[r][p]=res+t.get(r).get(p);

    }
}