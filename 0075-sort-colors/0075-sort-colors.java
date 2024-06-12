class Solution {
    public void sortColors(int[] a) {
        int l=0,m=0,h=a.length-1;
        while(m<=h){
            if(a[m]==0){
                //swap low,mid
                int t=a[l];
                a[l]=a[m];
                a[m]=t;
                l++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                int t=a[m];
                a[m]=a[h];
                a[h]=t;
                h--;
                
            }
        }
    }
}