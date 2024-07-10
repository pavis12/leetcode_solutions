class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int r[]=new int[n2.length];
        Stack<Integer> st=new Stack<>();
        List<Integer> l=new ArrayList<>();
        for(int i:n2){
            l.add(i);
        }
        for(int i=n2.length-1;i>=0;i--){
            if(st.isEmpty()){
                //st.push(-1);
                r[i]=-1;
            }
            else{
                while(!st.isEmpty()&&st.peek()<n2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    r[i]=-1;
                }
                else{
                    r[i]=st.peek();
                }
            }
            st.push(n2[i]);
            //l.add(n2[i]);
        }
        int f[]=new int[n1.length];
        for(int i=0;i<n1.length;i++){
            int b=l.indexOf(n1[i]);
            f[i]=r[b];
        }
        return f;
    }
}