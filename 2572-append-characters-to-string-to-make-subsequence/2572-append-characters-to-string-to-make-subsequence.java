class Solution {
    public int appendCharacters(String s, String t) {
        int j=0;
        int lt=t.length();
        int st=s.length();
        for(char i:s.toCharArray()){
            if(j<lt&&i==t.charAt(j)){
                j++;
            }
        }
        int c=lt-j;
        return c;
        
    }
}