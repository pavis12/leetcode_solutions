class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        a[1]=1;
        b[n]=n;
        for(int i=2;i<=n;i++){
            a[i]=i+a[i-1];
        }
        for(int i=n-1;i>=1;i--){
            b[i]=b[i+1]+i;
        }
        for(int i=1;i<=n;i++){
            if(a[i]==b[i]){
                return i;
            }
        }
        return -1;
    }
}