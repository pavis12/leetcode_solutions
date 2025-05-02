class Solution {
    public String pushDominoes(String d) {
        int l=d.length();
        String s="L"+d+"R";
        char a[]=s.toCharArray();
        int p=0;
        for(int i=1;i<a.length;i++){
            if(a[i]=='.')continue;
            if(a[i]==a[p]){
                for(int k=p+1;k<i;k++)a[k]=a[i];
            }
            else if(a[p]=='R'&&a[i]=='L'){
                int h=p+1,r=i-1;
                while(h<r){
                    a[h++]='R';
                    a[r--]='L';
                }
            }
            p=i;
        }
        return new String(a,1,l);
    }
    
}