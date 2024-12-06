class Solution {
    public int maxCount(int[] b, int n, int s) {
        HashSet<Integer> l=new HashSet<>();
        for(int i:b){
            l.add(i);
        }
        int p=0;
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!l.contains(i)){
               if(p+i<=s){
                p+=i;
                r.add(i);
               }
               else{
                break;
               }

            }
        }
        return r.size();
        
    }
}