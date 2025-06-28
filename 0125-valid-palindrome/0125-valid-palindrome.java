class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char k = Character.toLowerCase(s.charAt(i));
            char t = Character.toLowerCase(s.charAt(j));
            System.out.println(k+" "+t);
            if(!Character.isLetterOrDigit(k))i++;
            else if(!Character.isLetterOrDigit(t))j--;
            else if(k!=t)return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}