class Solution {
    public int findDuplicate(int[] n) {
        int l = n.length;
        for (int a:n) {
            int i=Math.abs(a);
            if(n[i]<0){
                return i;
            }
            n[i]=-n[i];

        }

        return l;
    }
}
