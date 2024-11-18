class Solution {
    public int minAddToMakeValid(String s) {
        int l=s.length();
        if(l==0){
            return 0;
        }
        int no=0,nc=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                no++;
            }
            else{
                if(no>0)no--;
                else nc++;
                
            }
            //System.out.println(no+" "+nc);
        }
       return no+nc;
    
    }
}