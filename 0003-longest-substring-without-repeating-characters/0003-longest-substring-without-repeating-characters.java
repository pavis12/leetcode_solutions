class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int c=0;
        Map<Character,Integer> m=new HashMap<>();
        while(i<s.length()){
           
            
                char t=s.charAt(i);
                m.put(t,m.getOrDefault(t,0)+1);
                while(m.get(t)>1){
                    m.put(s.charAt(j),m.get(s.charAt(j))-1);
                    j++;
                }
                c=Math.max(c,i-j+1);
                i++;
                

            
        }
        return c;
        
    }
}