class Solution {
    public int[] findErrorNums(int[] n) {
        int m=0;
        for(int i:n){
            if(i>m){
                m=i;
            }
        }
        //Arrays.sort(n);
        int b[]=new int[2];
        int c[]=new int[m+2];
        int p=0;
        
        for(int i:n){
            c[i]++;
            if(c[i]==2){
                b[0]=i;
                
            }
            
        }
       for(int i=1;i<=m+1;i++){
           if(c[i]==0){
               b[1]=i;
               break;
           }
       }
        return b;
    }
}