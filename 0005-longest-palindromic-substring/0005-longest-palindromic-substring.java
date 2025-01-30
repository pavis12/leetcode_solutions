class Solution {
    public String longestPalindrome(String s) {
        String g="";
        int n=s.length();
        if(n<=1)return s;
        int gl=0;
        for(int i=1;i<n;i++){
            int l=i;
            int h=i;
            while(s.charAt(l)==s.charAt(h)){
                l--;
                h++;
                if(l==-1||h>=n){
                    break;
                }
            }
            String k=s.substring(l+1,h);
            int m=k.length();
            if(m>gl){
                gl=m;
                g=k;
            }
            l=i-1;
            h=i;
            while(s.charAt(l)==s.charAt(h)){
                l--;
                h++;
                if(l==-1||h>=n){
                    break;
                }
            }
            k=s.substring(l+1,h);
            m=k.length();
            if(m>gl){
                gl=m;
                g=k;
            }
        }
        return g;
    }
}