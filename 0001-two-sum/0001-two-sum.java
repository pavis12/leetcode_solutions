class Solution {
    public int[] twoSum(int[] n, int t) {
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(!m.containsKey(n[i])){
                m.put(n[i],new ArrayList<>());
            }
            List<Integer> l=m.get(n[i]);
            l.add(i);
            m.put(n[i],l);
        }
        for(int i=0;i<n.length;i++){
            int d=t-n[i];
            if(m.containsKey(d)){
                List<Integer> p=m.get(d);
                for(int k:p){
                    if(k!=i){
                        return new int[]{i,k};
                    }
                }
            }
        }
        /*Arrays.sort(n);
        int i=0,j=n.length-1;
        while(i<j){
            if(n[i]+n[j]==t){
                return new int[]{i,j};
            }
            int s=n[i]+n[j];
            if(s>t){
                j--;
            }
            else{
                i++;
            }
        }*/
        return new int[]{0,0};
    }
}