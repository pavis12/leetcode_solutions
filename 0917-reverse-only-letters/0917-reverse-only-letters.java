class Solution {
    public String reverseOnlyLetters(String s) {
        int l=s.length();
        String g="";
        for(int i=0;i<l;i++){
            char t=s.charAt(i);
            if(Character.isAlphabetic(t)){
                g+=t;
            }
        }
        int k=g.length();
        k--;
        String b="";
        for(int i=0;i<l;i++){
            char t=s.charAt(i);
            if(Character.isAlphabetic(t)){
                char q=g.charAt(k);
                k--;
                b+=q;
            }
            else{
                b+=t;
            }
        }
        return b;
        
    }
}