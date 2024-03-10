class Solution {
    public int[] resultArray(int[] n) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(n[0]);
        l2.add(n[1]);
        for(int i=2;i<n.length;i++){
            int d=l1.get(l1.size()-1);
            int b=l2.get(l2.size()-1);
            if(d>b){
                l1.add(n[i]);
            }
            else{
                l2.add(n[i]);
            }
        }
        l1.addAll(l2);
        int a[]=new int[l1.size()];
        int k=0;
        for(k=0;k<l1.size();k++){
            a[k]=l1.get(k);
        }
        return a;
    }
}