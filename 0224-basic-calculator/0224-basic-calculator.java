class Solution {
    public int calculate(String str) {
        /*(->push sum int st
             push sign into stack  
             reset sum=0,sign=1
          )->pop top element 
             multiply with sum
             pop top element
             add with sum
           if sign(+/-)->
                +->sign=1
                - ->sign=-1
           if integer-> 
                sum+=(integer+sign);*/
        int s=0,sn=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            
            char r=str.charAt(i);
            if(r==' '){
                continue;
            }
            if(r=='('){
                st.push(s);
                st.push(sn);
                s=0;
                sn=1;
            }
            else if(r==')'){
                int h=st.pop();
                s=h*s;
                int z=st.pop();
                s+=z;
            }
            else if(r=='+'){
                sn=1;
            }
            else if(r=='-'){
                sn=-1;
            }
            else if(Character.isDigit(r)){
                int n=0;
                while(i<str.length()&&Character.isDigit(str.charAt(i))){
                
                    n=n*10+(str.charAt(i)-'0');
                    i++;
                }
                i--;
                s+=(n*sn);

            }
        }
        return s;
        
    }
}