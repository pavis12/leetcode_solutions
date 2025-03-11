class Solution {
    public int numberOfSubstrings(String s) {
        int l=s.length();
        int j=0;
        int r=0;
        int c[]=new int[3];
        for(int i=0;i<l;i++){
            char t=s.charAt(i);
            c[t-'a']++;
            while(c[0]>0&&c[1]>0&&c[2]>0){
                r+=(l-i);
                c[s.charAt(j)-'a']--;
                j++;
            }
        }
        return r;
    }
}