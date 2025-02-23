class Solution {
    public int minInsertions(String s) {
        String t1=s;
        StringBuilder b=new StringBuilder(t1);
        String t2=b.reverse().toString();
        int l1=t1.length();
        int l2=t2.length();
        int t[][]=new int[l1+1][l2+1];
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
        int i=l1;
        int j=l2;
        String g="";
        while(i>0&&j>0){
            if(t1.charAt(i-1)==t2.charAt(j-1)){
                g+=t1.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(t[i][j-1]>t[i-1][j]){
                    j--;
                }
                else{
                    i--;
                }
            }
        }
        return l1-g.length();
    }
}