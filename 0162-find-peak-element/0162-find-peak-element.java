class Solution {
    public int findPeakElement(int[] n) {
        int l=n.length;
        if(l==1)return 0;
        if(n[0]>n[1])return 0;
        if(n[l-1]>n[l-2])return l-1;
        int p=1,h=l-2;
        while(p<=h){
            int m=(p+h)/2;
            if(n[m]>n[m-1]&&n[m]>n[m+1])return m;
            else if(n[m]>n[m-1])p=m+1;
            else h=m-1;

        }
        return -1;
    }
}