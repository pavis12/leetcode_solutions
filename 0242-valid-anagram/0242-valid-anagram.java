class Solution {
    public boolean isAnagram(String s, String t) {
        int l=s.length();
        if(l!=t.length())return false;
        int c[]=new int[26];
        for(char a:s.toCharArray()){
            c[a-'a']++;
        }
        for(char a:t.toCharArray()){
            if(c[a-'a']<0)return false;
            c[a-'a']--;
        }
        for(int i=0;i<26;i++){
            if(c[i]!=0)return false;
        }
        return true;
    }
}