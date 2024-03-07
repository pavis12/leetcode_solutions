class Solution {
    public int maxProfit(int[] p) {
        int m=p[0];
        int s=0;
        for(int i=1;i<p.length;i++){
            if(p[i]>m){
                int c=p[i]-m;
                if(c>s){
                    s=c;
                }
            }
            else{
                m=p[i];
            }
        }
        return s;
    }
}