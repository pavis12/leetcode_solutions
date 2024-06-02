class Solution {
    public int[] twoSum(int[] arr, int t) {
        int p[]=new int[2];
         HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = t - num;
            if (mpp.containsKey(moreNeeded)) {
                p[0]=i;
                p[1]=mpp.get(moreNeeded);

                return p;
            }

            mpp.put(arr[i], i);
        }
        return p;
        
    }
}