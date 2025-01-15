class Solution {
    public boolean isIsomorphic(String s, String t) {
        int a[]=new int[206];
        int b[]=new int[206];
        int l=s.length();
        if(l!=t.length())return false;
        for(int i=0;i<l;i++){
            if(a[s.charAt(i)]!=b[t.charAt(i)])return false;
            a[s.charAt(i)]=i+1;
            b[t.charAt(i)]=i+1;
            
        }
        return true;
    }
}