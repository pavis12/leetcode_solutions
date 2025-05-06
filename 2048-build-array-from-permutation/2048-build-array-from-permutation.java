class Solution {
    public int[] buildArray(int[] n) {
        int l=n.length;
        int a[]=new int[l];
        for(int i=0;i<l;i++){
            a[i]=n[n[i]];
        }
        return a;
    }
}