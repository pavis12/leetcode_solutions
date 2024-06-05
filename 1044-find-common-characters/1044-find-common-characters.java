class Solution {
    public List<String> commonChars(String[] w) {
        List<String>l=new ArrayList<>();
       int[] m = new int[124];
        Arrays.fill(m, Integer.MAX_VALUE);

        for(int i=0;i<w.length;i++){
             int c[]=new int[124];
            for(char t:w[i].toCharArray()){
                c[t]++;
            }
            for(int j=0;j<124;j++){
            m[j]=Math.min(m[j],c[j]);
        }
        }
        
        for(int i=0;i<124;i++){
            while(m[i]>0){
                l.add(Character.toString(i));
                m[i]--;
            }
        }
        return l;
    }
}