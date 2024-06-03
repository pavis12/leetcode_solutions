class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int c=0;
        Map<Character,Integer> m=new HashMap<>();
        while(i<s.length()){
           
            
                char t=s.charAt(i);
                if(m.containsKey(t)){
                    j=Math.max(j,m.get(t)+1);
                }
                m.put(t,i);
               
                c=Math.max(c,i-j+1);
                i++;
                

            
        }
        return c;
        
    }
}