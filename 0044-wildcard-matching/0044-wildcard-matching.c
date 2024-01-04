bool isMatch(char* s, char* p) {
    int pl=strlen(p);
        int sl=strlen(s);
        bool a[sl+1][pl+1];
        for(int i=0;i<=sl;i++){
            for(int j=0;j<=pl;j++){
                if(i==0&&j==0)a[i][j]=true;
                else if(i==0){
                    if(p[j-1]=='*'){
                        a[i][j]=a[i][j-1];
                    }
                    else{
                        a[i][j]=false;
                    }
                }
                else if(j==0){
                    a[i][j]=false;
                }
                else if(s[i-1]==p[j-1]||p[j-1]=='?'){
                    a[i][j]=a[i-1][j-1];
                }
                else if(p[j-1]=='*'){
                    a[i][j]=a[i][j-1]||a[i-1][j];
                }
                else{
                    a[i][j]=false;
                }
            }
        }
        return a[sl][pl];
}