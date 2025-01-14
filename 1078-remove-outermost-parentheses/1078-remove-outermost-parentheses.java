class Solution {
    public String removeOuterParentheses(String s) {
        int l=s.length();
        List<String> g=new ArrayList<>();
        int o=0,c=0;
        String h="";
        for(int i=0;i<l;i++){
            char a=s.charAt(i);
            if(a=='(')o++;
            else c++;
            h+=a;
            if(o==c){
                g.add(h);
                o=0;
                c=0;
                h="";
            }
        }
        String p="";
        for(String k:g){
            if(k!=""){
                //System.out.println(k);
                String r=k.substring(1,k.length()-1);
                System.out.println(r);
                p+=r;
            }
        }
        return p;
    }
}