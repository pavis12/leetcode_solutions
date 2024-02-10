class Solution {
    public boolean isPal(String s,int st,int e){
        if(st==e){
            return true;
        }
        while(st<=e){
            char t=s.charAt(st);
            char u=s.charAt(e);
            if(t!=u){
                return false;
            }
            st++;
            e--;
        }
        return true;
        
    }
    public int countSubstrings(String s) {
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(isPal(s,i,j)){
                    c++;
                }
            }
        }
        return c;
    }
}