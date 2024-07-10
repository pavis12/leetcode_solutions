class Solution {
    public boolean isAnagram(String s, String t) {
        int c1[]=new int[26];
        int c2[]=new int[26];
        for(char i:s.toCharArray()){
            c1[i-'a']++;
        }
        for(char i:t.toCharArray()){
            c2[i-'a']++;
        }
        for(int i=0;i<26;i++){
            if(c1[i]!=c2[i])return false;
        }
        return true;
    }
}