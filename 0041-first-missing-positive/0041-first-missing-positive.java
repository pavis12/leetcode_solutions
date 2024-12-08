class Solution {
    public int firstMissingPositive(int[] n) {
        int l=n.length;
        int i=0;
        while(i<l){
            while(n[i]>0&&n[i]<=l&&n[n[i]-1]!=n[i]){
                int t=n[n[i]-1];
                n[n[i]-1]=n[i];
                n[i]=t;
            }
            i++;
        }
        for(i=0;i<l;i++){
            if(i+1!=n[i]){
                return i+1;
            }
        }
        return l+1;
    }
}