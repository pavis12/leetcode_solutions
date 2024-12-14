class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0]; // Special case: Only one house
        int[] d1 = new int[nums.length]; 
        int[] d2 = new int[nums.length];
        Arrays.fill(d1, -1);
        Arrays.fill(d2, -1);
        // Exclude the first house
        int excludeFirst = f(nums, nums.length - 1, d1, 1, nums.length - 1);
        // Exclude the last house
        int excludeLast = f(nums, nums.length - 2, d2, 0, nums.length - 2);
        return Math.max(excludeFirst, excludeLast);
    }

    public int f(int[] nums, int i, int[] d, int start, int end) {
        if (i < start) return 0;
        if (i == start) return nums[start];
        if (d[i] != -1) return d[i];
        int l = nums[i] + f(nums, i - 2, d, start, end);
        int r = f(nums, i - 1, d, start, end);
        return d[i] = Math.max(l, r);
    }
}
