class Solution {
    public String intToRoman(int num) {
        String[] s = { 
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" 
        };
        int v[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String r="";
        for(int i=0;i<v.length;i++){
            while(num>=v[i]){
                r+=s[i];
                num-=v[i];
            }
        }
        return r;
    }
    
}