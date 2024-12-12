class Solution {
    public long pickGifts(int[] g, int k) {
        int l=g.length;
        for(int i=0;i<k;i++){
            Arrays.sort(g);
            g[l-1]=(int)Math.sqrt(g[l-1]);
        }
        long s=0;
        for(int i:g){
            s+=(long)i;
        }
        return s;
    }
}