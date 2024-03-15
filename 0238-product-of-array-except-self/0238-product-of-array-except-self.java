class Solution {
    public int[] productExceptSelf(int[] n) {
        int l=n.length;
        int []p=new int[l];
        int []s=new int[l];
        int []a=new int[l];
        p[0]=1;
        s[l-1]=1;
        for(int i=1;i<l;i++){
            p[i]=p[i-1]*n[i-1];

        }
        int y=l-1;
        for(int i=l-2;i>=0;i--){
            s[i]=s[i+1]*n[y];
            y--;
        }
        for(int i=0;i<l;i++){
            a[i]=p[i]*s[i];
        }
        return a;


        
    }
}