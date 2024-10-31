class Solution {
    public int maxProfit(int[] p) {
        int min=p[0];
        int m=0;
        for(int i=1;i<p.length;i++){
            int d=p[i]-min;
            if(d>0){
                m=Math.max(m,d);
            }
            min=Math.min(min,p[i]);

        }
        return m;
    }
}