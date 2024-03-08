class Solution {
    public int maxFrequencyElements(int[] n) {
        int c[]=new int[101];
        int m=0;
        int p=0;
        for(int i=0;i<n.length;i++){
            c[n[i]]++;
            if(c[n[i]]>m){
                m=c[n[i]];
            }
            if(p<n[i]){
                p=n[i];
            }
        }
        int v=0;
        for(int i=0;i<=p;i++){
            if(c[i]==m){
                v++;
            }
        }
        return v*m;
    }
}