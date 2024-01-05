class Solution {
    public boolean canConstruct(String r, String m) {
        int [] a=new int[123];
        for(int i=0;i<m.length();i++){
            a[m.charAt(i)]++;
        }
        for(int i=0;i<r.length();i++){
            
            if(a[r.charAt(i)]>=1){
                a[r.charAt(i)]--;
            }
            else return false;
        }
        return true;
    }
}