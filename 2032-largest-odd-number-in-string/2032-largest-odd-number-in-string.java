class Solution {
    public String largestOddNumber(String s) {
        int l=s.length();
        int h=-1;
        for(int i=l-1;i>=0;i--){
            char t=s.charAt(i);
            int p=t-'0';
            if(p%2==1){
                h=i;
                break;
            }
        }
        if(h==-1)return "";
        return s.substring(0,h+1);
    }
}