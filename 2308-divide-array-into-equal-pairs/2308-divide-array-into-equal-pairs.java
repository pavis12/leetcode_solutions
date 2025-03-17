class Solution {
    public boolean divideArray(int[] n) {
        int d[]=new int[501];
        int c=0;
        for(int i:n){
            if(d[i]%2==1){
                d[i]++;
                if(c!=0)c--;
            }
            else{
                d[i]++;
                c++;
            }
        }
        return c==0;
    }
}