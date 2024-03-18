class Solution {
    public List<List<Integer>> permuteUnique(int[] n) {
        List<List<Integer>> l=new ArrayList<>();
        recur(0,n,l);
        return l;
    }
    private static void recur(int i,int[] n,List<List<Integer>> l){
        if(i==n.length){
           List<Integer> ds=new ArrayList<>();
            for(int k=0;k<n.length;k++){
                ds.add(n[k]);
            }
            if(!containsl(l,ds)){
            l.add(new ArrayList<>(ds));
            }
            return;
        }
        for(int j=i;j<n.length;j++){
            swap(j,i,n);
            recur(i+1,n,l);
            swap(j,i,n);
        }
        
    }
    private static void swap(int i,int j,int[] n){
        int t=n[i];
        n[i]=n[j];
        n[j]=t;
    }
    private static boolean containsl(List<List<Integer>> l, List<Integer> ds) {
        for (List<Integer> list : l) {
            if (list.equals(ds)) {
                return true;
            }
        }
        return false;
    }
}