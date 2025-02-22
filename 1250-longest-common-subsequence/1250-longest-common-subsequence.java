class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int l1=t1.length();
        int l2=t2.length();
        int t[][]=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++){
            t[i][0]=0;
        }
        for(int j=0;j<=l2;j++){
            t[0][j]=0;
        }
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[l1][l2];
    }
}