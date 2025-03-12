class Solution {
    public int numberOfAlternatingGroups(int[] c) {
        int d[]=new int[c.length+2];
        for(int i=0;i<d.length;i++){
            d[i]=c[i%c.length];
        }
        System.out.println(d);
        int p=0;
        for(int i=1;i<d.length-1;i++){
            if(d[i]!=d[i-1]&&d[i]!=d[i+1])p++;
        }
        return p;

    }
}