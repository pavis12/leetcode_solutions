class Solution {
    public int majorityElement(int[] n) {
        int c=0,a=0;
        for(int i:n){
            if(c==0){
                a=i;
                c++;
            }
            else if(i==a){
                c++;
            }
            else{
                c--;
                
            }
        }
        return a;
    }
}