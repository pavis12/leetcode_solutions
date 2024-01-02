class Solution {
    public int isp(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return 0;
            }
        }
        if(n==1){
            return 0;
        }
        return 1;
    }
    public int countPrimeSetBits(int l, int r) {
        int s=0;
        for(int i=l;i<=r;i++){
            int c=0;
            String g=Integer.toBinaryString(i);
            for(char k:g.toCharArray()){
                if(k=='1'){
                    c++;
                }
            }
            int d=isp(c);
            if(d==1){
                s++;
            }
            //s+=c;
        }
        return s;
    }
}