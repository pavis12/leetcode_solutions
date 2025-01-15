class Solution {
    public int maxDepth(String s) {
        int o=0,c=0;
        int l=s.length();
        int m=0;
        for(char a:s.toCharArray()){
            if(a=='(')o++;
            else if(a==')') o--;
            m=Math.max(m,o);
            //System.out.println(o);

        }
        return m;
    }
}