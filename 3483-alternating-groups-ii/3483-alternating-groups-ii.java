class Solution {
    public int numberOfAlternatingGroups(int[] c, int k) {
        int w=1,a=0;
        int n=c.length;
        for(int i=1;i<=n-1+k-1;i++){
            if(c[i%n]!=c[(i-1+n)%n]){
                w++;
            }
            else{
                w=1;
            }
            if(w>=k)a++;
        }
        return a;
    }
}