class Solution {
    public String customSortString(String o, String s) {
        int lo=o.length();
        int ls=s.length();
        int c[]=new int[123];
        for(int i=0;i<ls;i++){
            char t=s.charAt(i);
            int h=(int)t;
            c[t]++;
        }
        String g="";
        for(int i=0;i<lo;i++){
            char t=o.charAt(i);
            int h=(int)t;
            /*if(c[t]>0){
                g+=t;
                c[t]--;
            }*/
            if(c[h]>0){
                int d=c[h];
                 int co=0;
                while(co<d){
                    g+=t;
                    co++;
                }
                c[h]=0;
            }
        }
        for(int i=0;i<123;i++){
            if(c[i]>0){
                int d=c[i];
                char r=(char)i;
                int co=0;
                while(co<d){
                    g+=r;
                    co++;
                }
            }
        }
        return g;
        
    }
}