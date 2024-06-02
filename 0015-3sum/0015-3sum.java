class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> nl=new ArrayList<>();
        Arrays.sort(n);
        int m=n.length;
        for(int i=0;i<m;i++){
            if(i>0&&n[i]==n[i-1])continue;
            int j=i+1;
            int k=m-1;
            while(j<k){
                int s=n[i];
                s+=n[j];
                s+=n[k];
                if(s==0){
                    List<Integer> p=new ArrayList<>();
                    p.add(n[i]);
                    p.add(n[j]);
                    p.add(n[k]);
                    nl.add(p);
                    j++;
                    k--;
                    while(j<k&&n[j]==n[j-1])j++;
                    while(j<k&&n[k]==n[k+1])k--;
                }
                else if(s>0){
                    k--;
                }
                else{
                    j++;
                }
                

            }
        }
        return nl;
        
    }
}