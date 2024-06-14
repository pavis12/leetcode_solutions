class Solution {
  public int minIncrementForUnique(int[] nums) {
    // Sort the array to group elements that might cause collisions
    Arrays.sort(nums);

    int count = 0;
    // Iterate through the sorted array starting from the second element
    for (int i = 1; i < nums.length; i++) {
      // Check if the current element collides with the previous element
      if (nums[i] <= nums[i - 1]) {
        // Calculate the minimum increment needed to make the current element unique
        int toIncrease = Math.abs(nums[i] - nums[i - 1]) + 1;
        // Update the current element in the array to avoid collision
        nums[i] = nums[i - 1] + 1;
        // Add the required increment to the counter
        count += toIncrease;
      }
    }
    // Return the total number of increments needed to make all elements unique
    return count;
  }
}