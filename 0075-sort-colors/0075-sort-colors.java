class Solution {
    public void sortColors(int[] n) {
        int l=0,m=0,h=n.length-1;
        while(m<=h){
            if(n[m]==0){
                int t=n[l];
                n[l]=n[m];
                n[m]=t;
                l++;
                m++;
            }
            else if(n[m]==1){
                m++;   
            }
            else{
                int t=n[h];
                n[h]=n[m];
                n[m]=t;
                h--;
            }
        }
    }
}