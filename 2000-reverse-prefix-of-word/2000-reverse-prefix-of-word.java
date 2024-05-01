class Solution {
    public String reversePrefix(String w, char c) {
        int k=0;
        for(int i=0;i<w.length();i++){
            if(w.charAt(i)==c){
                k=i;
                break;
            }
        }
        String q=w.substring(0,k+1);
        StringBuilder b=new StringBuilder(q);
        String r=w.substring(k+1,w.length());
        StringBuilder m=new StringBuilder(r);
        b.reverse();
        b.append(m);
        String s=b.toString();
        return s;
    }
}