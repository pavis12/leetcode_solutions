class Solution {
    public int[][] merge(int[][] a) {

        Arrays.sort(a,new Comparator<int[]>(){
            public int compare(int a[],int[]b){
                return a[0]-b[0];
            }
        });
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<a.length;i++){
           if(l.isEmpty()||a[i][0]>l.get(l.size()-1).get(1)){
                l.add(Arrays.asList(a[i][0],a[i][1]));
           }
           else{
            //here set(1) says which idex to change
            l.get(l.size()-1).set(1,Math.max(a[i][1],l.get(l.size()-1).get(1)));
           }
        }
        int r[][]=new int[l.size()][2];
        int i=0;
        for(List<Integer> p:l){
            r[i][0]=p.get(0);
            r[i][1]=p.get(1);
            i++;
        }
        return r;
    }
}