class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String g=count(n,"1");
        return g;
        
    }
    public String count(int n,String h) {
        if(n==1){
            return h;
        }
        StringBuilder s = new StringBuilder();
        int l=h.length();
        for(int i=0;i<l;i++){
            char q=h.charAt(i);
            int c=1;
            for(int j=i+1;j<l;j++){
                char k=h.charAt(j);
                if(k!=q){
                    break;
                }
                c++;
            }
            
            s.append(c);
            s.append(q);
            i += c - 1;
            
        }
        return count(n-1,s.toString());
    }
    
}