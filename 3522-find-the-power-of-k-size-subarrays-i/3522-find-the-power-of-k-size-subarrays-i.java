class Solution {
    public int[] resultsArray(int[] n, int k) {
        int l=n.length;
        int [] a=new int[l-k+1];
        int j=0;
        for(int i=0;i<l-k+1;i++){
            int m=-1,f=0;
            for(int p=i;p<i+k;p++){
                System.out.print(n[p]+" ");
                if(p==i+k-1)m=Math.max(n[p],m);
                else if(p<l-1&&n[p]<n[p+1]&&n[p+1]==n[p]+1){
                    m=Math.max(n[p],m);
                }
                else{
                    f=1;
                    break;
                }
            }
            System.out.println();
            if(f==0)a[j++]=m;
            else a[j++]=-1;
        }
        return a;
    }
}