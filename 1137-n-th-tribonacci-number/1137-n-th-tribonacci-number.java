class Solution {
    public int tribonacci(int n) {
        int n0=0,n1=1,n2=1;
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int p=0;
        for(int i=3;i<=n;i++){
            p=n0+n1+n2;
            n0=n1;
            n1=n2;
            n2=p;
        }
        return p;

    }
}