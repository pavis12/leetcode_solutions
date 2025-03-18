class Solution {
    public int longestNiceSubarray(int[] n) {
        int i = 0, j = 0;  // Start both pointers at 0
        int m = 1;  // Start with a subarray of length 1 (the first element itself is always nice)
        int l = n.length;
        int bitwiseOr = 0;  // This will keep track of the bitwise OR of all elements in the current window
        
        // Traverse through the array using the right pointer 'i'
        while (i < l) {
            // If current element 'n[i]' can be added to the current subarray (no overlapping bits)
            if ((bitwiseOr & n[i]) == 0) {
                bitwiseOr |= n[i];  // Update bitwise OR by including the current element
                m = Math.max(m, i - j + 1);  // Update maximum length of nice subarray
                i++;  // Move right pointer to the next element
            } else {
                // If adding 'n[i]' makes the subarray invalid, move left pointer 'j' to the right
                bitwiseOr &= ~n[j];  // Remove 'n[j]' from bitwise OR (effectively shrinking the window from the left)
                j++;  // Move left pointer to the right
            }
        }
        
        return m;  // Return the length of the longest nice subarray
    }
}
