class Solution {
    public boolean rotateString(String s, String g) {
        int l=s.length();
        if(l!=g.length())return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==g.charAt(0)){
                String h=s.substring(0,i);
                String k=s.substring(i,l);
                String j=k+h;
                if(g.equals(j))return true;
            }
        }
        return false;
    }
}