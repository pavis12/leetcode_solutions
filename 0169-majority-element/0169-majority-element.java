class Solution {
    public int majorityElement(int[] n) {
        int l=n.length;
        int e=0,c=0;
        for(int i=0;i<l;i++){
            if(c==0){
                e=n[i];
                c++;
            }
            else if(e==n[i]){
                c++;
            }
            else{
                c--;
            }
        }
        int g=0;
        for(int i=0;i<l;i++){
            if(e==n[i]){
                g++;
            }
        }
        /*int d=0;
        if(d%2==0){
            d=(n/2)+1;
        }
        else{
            d=n/2;
        }
        if(g>d){
            return e;
        }*/
        return e;
        
        
        
    }
    
}