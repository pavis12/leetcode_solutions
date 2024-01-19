class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        int i=0,j=l-1;
        while(i<=j){
            char g=s[i];
            s[i]=s[j];
            s[j]=g;
            i++;
            j--;
        }
        
    }
}