class Solution {
    public int appendCharacters(String s, String t) {
        int j=0;
        
        for(int i=0;i<s.length();i++){
            if(j<t.length()&&s.charAt(i)==t.charAt(j)){
                j++;
            }
        }
        int c=t.length()-j;
        return c;
        
    }
}