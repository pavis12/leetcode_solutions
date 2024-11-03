class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int l=0,r=m[0].length-1,t=0,b=m.length-1;
        List<Integer> k=new ArrayList<>();
        while(t<=b&&l<=r){
            //lrft to right
            for(int i=l;i<=r;i++){
                k.add(m[t][i]);
            }
            t++;
            //top to bottom
            for(int i=t;i<=b;i++){
                k.add(m[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    k.add(m[b][i]);

                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    k.add(m[i][l]);
                }
                l++;
            }

            
        }
        return k;
    }
}