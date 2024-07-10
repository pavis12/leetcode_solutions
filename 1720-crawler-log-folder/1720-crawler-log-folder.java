class Solution {
    public int minOperations(String[] l) {
        int d=0;
        for(String g:l){
            if(g.equals("../")){
                d=Math.max(0,d-1);
            }
            else if(g.equals("./")){
                continue;
            }
            else{
                d++;
            }
        }
        return d;
    }
}