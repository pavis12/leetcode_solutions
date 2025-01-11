class Solution {
    public int trap(int[] h) {
        int l=h.length;
        int la[]=new int [l];
        int ra[]=new int[l];
        la[0]=h[0];
        for(int i=1;i<l;i++){
            
                la[i]=Math.max(la[i-1],h[i]);
            
        }
        ra[l-1]=h[l-1];
        for(int i=l-2;i>=0;i--){
            
                ra[i]=Math.max(ra[i+1],h[i]);
            
        }
        int c=0;
        for(int i=0;i<l;i++){
            int m=Math.min(la[i],ra[i]);
            c+=m-h[i];
        }
        return c;

    }
}