class Solution {
    public int maxArea(int[] h) {
        int l=h.length;
        int i=0,j=l-1;
        int m=0;
        while(i<j){
            int d=Math.min(h[i],h[j]);
            int g=j-i;
            int f=d*g;
            if(f>m){
                m=f;
            }
            if(h[i]<h[j]){
                i++;
            }
            else{
                j--;
            }
            
        }
        return m;
    }
}