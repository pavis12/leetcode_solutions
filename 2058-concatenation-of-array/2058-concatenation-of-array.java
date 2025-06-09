class Solution {
    public int[] getConcatenation(int[] n) {
        int l=n.length;
        int a[]=new int[2*l];
        for(int i=0;i<2*l;i++){
            a[i]=n[i%l];
            //System.out.println(a[i]);
        }
        return a;
    }
}