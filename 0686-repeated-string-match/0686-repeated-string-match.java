class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        
        int c=b.length()/a.length();
        int p=1;
        String r=a;
        for(int i=0;i<=c+1;i++){
            if(a.contains(b))return p;
            a+=r;
            p++;
        }
        return -1;
    }
}