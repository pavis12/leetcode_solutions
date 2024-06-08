class Solution {
    public String getPermutation(int n, int k) {
        int f=1;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<n;i++){
            f*=i;
            l.add(i);
        }
        l.add(n);
        String a="";
        k=k-1;
        while(true){
            a=a+l.get(k/f);
            l.remove(k/f);
            if(l.size()==0)break;
            k=k%f;
            f=f/l.size();
        }
        return a;
    }
}