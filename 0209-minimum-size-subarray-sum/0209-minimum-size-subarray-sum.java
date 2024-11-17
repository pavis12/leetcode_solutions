class Solution {
    public int minSubArrayLen(int t, int[] n) {
        int i=0,j=0,f=0;
        int m=Integer.MAX_VALUE;
        int l=n.length;
        int s=0;
        int c=0;
        while(i<l&&j<l){
            s+=n[j];
            c++;
            j++;
            if(s>=t){
                f=1;
                m=Math.min(c,m);
                i++;
                j=i;
                c=0;
                s=0;
            }

        }
        if(f==1)return m;
        return 0;
    }
}