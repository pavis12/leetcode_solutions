class Solution {
    public int commonFactors(int a, int b) {
        //int max=Math.max(a,b);
        int min=Math.min(a,b);
        int c=0;
        for(int i=1;i<=min;i++){
            if(a%i==0&&b%i==0){
                c++;
            }
        }
        return c;
        
    }
}