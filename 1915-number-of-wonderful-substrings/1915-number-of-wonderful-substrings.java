class Solution {
    public long wonderfulSubstrings(String w) {
        int c[]=new int[1024];
        int m=0;
        c[0]=1;
        long r=0;
        for(char ch :w.toCharArray()){
            m^=1<<(ch-'a');
            r+=c[m];
            for(int i=0;i<10;i++){
                r+=c[m^(1<<i)];
            }
            c[m]++;
        }
        return r;
    }
}