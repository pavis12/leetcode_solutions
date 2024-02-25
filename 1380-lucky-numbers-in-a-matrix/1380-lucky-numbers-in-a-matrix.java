class Solution {
    public List<Integer> luckyNumbers (int[][] m) {
        List<Integer> l=new ArrayList<>();
        int r=m.length;
        int c=m[0].length;
         List<Integer> minr=new ArrayList<>();
         List<Integer> maxr=new ArrayList<>();
        for(int i=0;i<r;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<c;j++){
                if(m[i][j]<min){
                    min=m[i][j];
                }
            }
            minr.add(min);
        }
        for(int i=0;i<c;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<r;j++){
                if(m[j][i]>max){
                    max=m[j][i];
                }
            }
            maxr.add(max);
        }
        for(int i:minr){
            if(maxr.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}