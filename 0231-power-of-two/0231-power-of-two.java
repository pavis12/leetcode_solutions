class Solution {
    public boolean isPowerOfTwo(int n) {
        //n=Math.abs(n);
        /*for(int i=0;i<=100000000;i++){
            if(1<<i==n){
                return true;
            }
            if((1<<i)>n){
                return false;
            }
        }
        return false;*/
        return n > 0 && (n & (n - 1)) == 0;
    }
}