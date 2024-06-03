class Solution {
    public int appendCharacters(String s, String t) {
        int j=0;
        int lt=t.length();
        int st=s.length();
        for(int i=0;i<st;i++){
            if(j<lt&&s.charAt(i)==t.charAt(j)){
                j++;
            }
        }
        
        return lt-j;
        
    }
}