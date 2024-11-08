class Solution {
    public int maxProduct(int[] n) {
        int l=n.length;
        int m=Integer.MIN_VALUE;
        int c=1;
        int mv=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            c*=n[i];
            m=Math.max(c,m);
            if(c==0){
                c=1;
            }
            
        }
        c=1;
         for(int i=l-1;i>=0;i--){
            c*=n[i];
            mv=Math.max(c,mv);
            if(c==0){
                c=1;
            }
            
        }
        
        if(mv>m){
            return mv;
        }
        return m;
    }
}