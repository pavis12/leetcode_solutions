class Solution {
    public boolean canPartition(int[] a) {
        int s=0;
        for(int i:a)s+=i;
        if(s%2==1)return false;
        //return p(a,s/2,a.length);
        int p=s/2;
        boolean t[]=new boolean[p+1];
        t[0]=true;
        for(int n:a){
            for(int j=p;j>=n;j--){
                t[j]=t[j]||t[j-n];
            }
        }
        return t[p];
    }
    public boolean p(int []a,int s,int n){
        if(s==0)return true;
        if(n==0)return false;
        return p(a,s-a[n-1],n-1)||p(a,s,n-1);
    }
}