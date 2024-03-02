class Solution {
    public int[] sortedSquares(int[] n) {
        int d[]=new int[n.length];
        int k=0;
        for(int i=0;i<n.length;i++){
            d[i]=n[i]*n[i];
        }
       
        Arrays.sort(d);
        return d;
        
    }
}