class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int c=0;
        while(t[k]>0){
            for(int i=0;i<t.length;i++){
                if(t[i]>0){
                    t[i]--;
                    c++;
                    if(t[k]==0){
                        return c;
                    }
                }
            }
        }
        return c;
    }
}