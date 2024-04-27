class Solution {
    public int findRotateSteps(String r, String k) {
        int d[][]=new int[k.length()][r.length()];
        for(int ro[]:d){
            Arrays.fill(ro,-1);
            
        }
        return sol(r,k,0,0,d);
    }
    public int sol(String r, String k,int p,int i,int[][]d){
        int n=r.length();
        if(i>=k.length()){
            return 0;
        }
        if(d[i][p]!=-1){
            return d[i][p];
        }
        int s=Integer.MAX_VALUE;
        for(int j=0;j<r.length();j++){
            
            if(r.charAt(j)==k.charAt(i)){
                s=Math.min(s, Math.min(Math.abs(j-p),n-Math.abs(j-p)) +1+ sol(r,k,j,i+1,d) );
            }
        }
        return d[i][p]=s;
    }
}