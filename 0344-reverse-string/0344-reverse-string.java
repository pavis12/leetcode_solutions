class Solution {
    public void reverseString(char[] s) {
        int l=s.length-1;
        int i=0,j=l;
        while(i<=j){
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++;
            j--;
        }
    }
}