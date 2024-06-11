class Solution {
    public int[] relativeSortArray(int[] a1, int[] a2) {
        Arrays.sort(a1);
       // Arrays.sort(a2);
        int c1[]=new int[a1[a1.length-1]+1];
        //int c2[]=new int[a2[a2.length-1]];

        for(int i:a1){
            c1[i]++;
        }
        List<Integer> l=new ArrayList<>();
        for(int i:a2){
            if(c1[i]>0){
               // int d=c1[i];
                int k=0;
                while(k<c1[i]){
                    l.add(i);
                    k++;
                }
                c1[i]=0;
            }
        }
        for(int i:a1){
            if(c1[i]>0){
                //int d=c1[i];
                int k=0;
                while(k<c1[i]){
                    l.add(i);
                    k++;
                }
                c1[i]=0;
            }
        }
        int h[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            h[i]=l.get(i);
        }
        return h;
    }
}