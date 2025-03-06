class Solution {
    public int[] findMissingAndRepeatedValues(int[][] g) {
        int r=0;
        int m=0;
        int l=g.length;
        int a[]=new int[l*l+1];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                int d=g[i][j];
                //System.out.println(d);
                a[d]+=1;
                //System.out.println(d+" "+a[d]);
                if(a[d]==2){
                    r=d;
                }
                
                /*if(r!=0&&m!=0){
                    break;
                }*/
            }
        }
        for(int i=1;i<=l*l;i++){
            if(a[i]==0){
                m=i;
                break;
            }
        }
        /*if(a[l*l]==0){
            m=l*l;
            System.out.println(l*l);
        }
        else if(a[1]==0){
            m=1;
        }*/
        return new int[]{r,m};
    }
}