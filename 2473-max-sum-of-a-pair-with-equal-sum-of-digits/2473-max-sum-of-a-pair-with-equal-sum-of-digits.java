import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {
        int maxSum = -1;
        Map<Integer, int[]> map = new HashMap<>();

        // Iterate over numbers and group by digit sum
        for (int num : nums) {
            int digitSum = getDigitSum(num);
            
            // Maintain only the top two largest numbers for each digit sum
            map.putIfAbsent(digitSum, new int[]{-1, -1});
            int[] topTwo = map.get(digitSum);

            if (num > topTwo[0]) {
                topTwo[1] = topTwo[0]; // Shift down the previous max
                topTwo[0] = num;       // New max
            } else if (num > topTwo[1]) {
                topTwo[1] = num;       // Update second max
            }
        }

        // Find the maximum sum of two numbers sharing the same digit sum
        for (int[] topTwo : map.values()) {
            if (topTwo[1] != -1) {
                maxSum = Math.max(maxSum, topTwo[0] + topTwo[1]);
            }
        }

        return maxSum;
    }

    // Function to calculate the sum of digits of a number
    private int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {18, 43, 36, 13, 7};
        int[] nums2 = {10, 12, 19, 14};

        System.out.println(sol.maximumSum(nums1)); // Output: 54
        System.out.println(sol.maximumSum(nums2)); // Output: -1
    }
}
