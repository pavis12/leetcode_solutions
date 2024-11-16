class Solution {
    public int[] resultsArray(int[] n, int k) {
        if(k==1){
            return n;
        }
        int l=n.length;
        int [] a=new int[l-k+1];
        Arrays.fill(a,-1);
        int j=0;
        int c=1;
        for(int i=0;i<l-1;i++){
            if(n[i]+1==n[i+1]){
                c++;
            }
            else{
                c=1;
                
            }
            if(c>=k){
                a[i-k+2]=n[i+1];
            }
        }
        return a;
    }
}