class Solution {
    public boolean check(int[] n) {
        int l=n.length;
        int i=0;
        int c=0;
        for(i=0;i<l-1;i++){
            
            if(n[i]>n[i+1]){
                c++;
            }
        }
        if(n[0]<n[l-1])c++;
       
        if(c>1)return false;
        else return true;
    }
}