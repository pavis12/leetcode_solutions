class Solution {
    public int lengthOfLIS(int[] n) {
        int l=n.length;
        int d[]=new int[l];
        Arrays.fill(d,1);
        int m=1;
        for(int i=0;i<l;i++){
            for(int j=0;j<i;j++){
                if(n[j]<n[i]){
                    d[i]=Math.max(d[i],1+d[j]);
                }
            }
            m=Math.max(m,d[i]);
        }
        return m;
    }
}