class Solution {
    public int beautySum(String s) {
        int r=0;
        int l=s.length();
        for(int i=0;i<l;i++){
            int []f = new int[26];
            for(int j=i;j<l;j++){
                int c = s.charAt(j) - 'a';
                f[c]++;
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int k=0;k<26;k++){
                    if(f[k]>0){
                        min=Math.min(min,f[k]);
                        max=Math.max(max,f[k]);
                    }
                }
                r+=(max-min);
            }
            
        }
        return r;
    }
}