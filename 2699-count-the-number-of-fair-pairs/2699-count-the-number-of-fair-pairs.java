class Solution {
    public long countFairPairs(int[] n, int l, int u) {
        Arrays.sort(n);
        return c(n,u)-c(n,l-1);

    }
    public long c(int []n,int com){
        long a=0;
        int j=n.length-1;
        for(int i=0;i<j;i++){
            while(i<j&&n[i]+n[j]>com)j--;
            a+=j-i;
        }
        return a;
    }
}