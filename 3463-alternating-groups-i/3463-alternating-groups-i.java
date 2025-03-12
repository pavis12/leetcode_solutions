class Solution {
    public int numberOfAlternatingGroups(int[] c) {
        int n=c.length;
        int p=0;
        for(int i=0;i<c.length;i++){
            if(c[i]!=c[(i+1)%n]&&c[i]!=c[(i-1+n)%n])p++;
        }
        return p;
    }
}