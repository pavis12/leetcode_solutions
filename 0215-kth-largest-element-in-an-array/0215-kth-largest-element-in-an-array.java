class Solution {
    public int findKthLargest(int[] n, int k) {
        // Use a Min-Heap to keep the k largest elements
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i : n) {
            q.add(i); // Add the current element to the heap
            if (q.size() > k) { // Maintain heap size of k
                q.remove(); // Remove the smallest element
            }
        }
        
        // At this point, the root of the heap contains the k-th largest element
        return q.peek(); // Return the root of the heap
    }
}
