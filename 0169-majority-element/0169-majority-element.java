class Solution {
    public int majorityElement(int[] n) {
        int c=0;
        int e=0;
        
        for(int i=0;i<n.length;i++){
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
        return e;
        
        
        
    }
    
}