class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> st=new Stack<>();
        for(String h:t){
            if((!h.equals("+"))&&(!h.equals("-"))&&(!h.equals("/"))&&(!h.equals("*"))){
                int q=Integer.parseInt(h);
                st.push(q);
            }
            else{
                int m=st.pop();
                int n=st.pop();
                int f=0;
                if(h.equals("+")){
                    f=m+n;
                }
                else if(h.equals("-")){
                    f=n-m;
                }
                else if(h.equals("/")){
                    f=n/m;
                }
                else if(h.equals("*")){
                    f=m*n;
                }
                st.push(f);
            }
        }
        return st.pop();
    }
}