class Solution {
    public boolean checkIfExist(int[] a) {
        Map<Integer,Integer>l=new HashMap<>();
        for(int i=0;i<a.length;i++){
            l.put(a[i],i);
        }
        for(int i=0;i<a.length;i++){
            if(l.containsKey(a[i]*2)&&l.get(a[i]*2)!=i)return true;
        }
        return false;
    }
}