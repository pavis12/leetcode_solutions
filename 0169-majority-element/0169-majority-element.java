class Solution {
    public int majorityElement(int[] n) {
        int c=0,m=0;
        int l=n.length;
        for(int i:n){
           if(c==0){
            m=i;
            c++;
           }
           else if(m==i)c++;
           else c--;
            
        }
        return m;
    }
}