class Solution {
    public String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        int i=0;
        String g=s[0];
        String h=s[s.length-1];
        while(i<g.length()&&i<h.length()){
            if(g.charAt(i)==h.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        String b=g.substring(0,i);
        return b;
    }
}