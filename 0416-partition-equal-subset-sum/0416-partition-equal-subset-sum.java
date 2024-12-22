class Solution {
    public boolean canPartition(int[] n) {
        int s=0;
        for(int i:n){
            s+=i;
        }
        if((s&1)==1)return false;
        s=s/2;
        int l=n.length;
        boolean d[]=new boolean[s+1];
        d[0]=true;
        for(int i:n){
            for(int j=s;j>=i;j--){
                d[j]=d[j] || d[j-i];
            }
        }
        return d[s];

    }
    
}