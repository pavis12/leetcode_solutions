class Solution {
    public int firstMissingPositive(int[] n) {
        int l=n.length;
        for(int i=0;i<l;i++){
            while (n[i] > 0 && n[i] <= l && n[n[i] - 1] != n[i]) {
                int temp = n[n[i] - 1];
                n[n[i] - 1] = n[i];
                n[i] = temp;
            }
        }
        for(int i=0;i<l;i++){
            if(i+1!=n[i]){
                return i+1;
            }
        }
        return l+1;
    }
}