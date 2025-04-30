class Solution {
    public String convertToTitle(int c) {
        StringBuilder a=new StringBuilder();
        while(c>0){
            c--;
            a.append((char) (((c) % 26) + 'A'));
            System.out.println((c%26)+'A');
            c/=26;
        }
        return a.reverse().toString();
    }
}