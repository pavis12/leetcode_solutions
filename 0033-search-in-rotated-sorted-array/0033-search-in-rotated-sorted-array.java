class Solution {
    public int search(int[] n ,int t) {
        int s=0;
        int e=n.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(n[m]==t)return m;
            if(n[s]<=n[m]){
                if(n[s]<=t&&t<=n[m]){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
            else {

                if(n[e]>=t&&n[m]<=t){
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
        }
        return -1;
    }
}