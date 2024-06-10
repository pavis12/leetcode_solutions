class Solution {
    public int heightChecker(int[] h) {
        int c[]=new int[h.length];
        for(int i=0;i<h.length;i++){
            c[i]=h[i];
        }
        Arrays.sort(c);
        int l=0;
        for(int i=0;i<h.length;i++){
            if(c[i]!=h[i]){
                l++;
            }
        }
        return l;
    }
}