class Solution {
    public int countSymmetricIntegers(int l, int h) {
        int r=0;
        for(int a=l;a<=h;a++){
            if(a<100&&a%11==0)r++;
            else if(1000<=a&&a<10000){
                int m=a/1000+(a%1000)/100;
                int n=(a%100)/10+(a%10);
                if(m==n)r++;
            }
        }
        return r;
    }
}