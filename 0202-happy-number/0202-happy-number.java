class Solution {
    public static long sum(long n){
        long s=0;
        while(n!=0){
            long h=n%10;
            s+=(h*h);
            n=n/10;
        }
        return s;
    }
    /*public static boolean only(long n){
        int f=1;
        while(n!=0){
            long h=n%10;
            if(h!=1){
                f=0;
                return false;
            }
            n=n/10;
        
            
        }
        return true;
    }*/
    public boolean isHappy(int n) {
        long d=n;
        if(d==1||d==7){
            return true;
        }
        
        while(d!=1){
            long k=sum(d);
            if(k==1||k==7){
                return true;
            }
            if(k>=0&&k<=9){
                return false;
            }
            d=k;
        }
        return false;
    }
}