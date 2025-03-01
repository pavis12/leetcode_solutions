class Solution {
    public int[] applyOperations(int[] n) {
        int l=n.length;
        int a[]=new int[l];
        int j=0;
        int c=0;
        for(int i=0;i<l-1;i++){
            if(n[i]==n[i+1]){
                n[i]*=2;
                n[i+1]=0;
                System.out.println(n[i]+" "+n[i+1]);
            }
            if(n[i]!=0)a[j++]=n[i];
        }
        a[j++]=n[l-1];
        return a;
    }
}