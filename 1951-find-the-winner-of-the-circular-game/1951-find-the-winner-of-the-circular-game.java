class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(i);
        }
        int p=0;
        while(l.size()>1){
            int h=(p+k-1)%l.size();
            l.remove(h);
            p=h;
        }
        return l.get(0);
    }
}