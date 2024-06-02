class Solution {
    public double myPow(double x, int nn) {
        double a=1.0;
        int f=0;
        long n=nn;
        if(n<0){
            f=1;
            n*=-1;
        }
        while(n>0){
            if(n%2==0){
                x*=x;
                n/=2;
            }
            else{
                a*=x;
                n--;
            }
        }
        if(f==1){
            return (double)1.0/(double)a;
        }
        return a;
    }
}