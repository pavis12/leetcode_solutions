import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);  // Base case: there's one way to get sum 0, with no elements.
        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            // Check if currentSum - k exists in the map
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k); // Add the count of subarrays with sum k
            }

            // Update the map with the current sum
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
