class Solution {
    public int[] twoSum(int[] n, int t) {
    Map<Integer, Integer> l = new HashMap<>();
    
    // Store the first element's value and index
    l.put(n[0], 0);
    
    // Iterate over the rest of the array
    for (int i = 1; i < n.length; i++) {
        int p = t - n[i];  // Calculate the complement
        
        // Check if the complement exists in the map
        if (l.containsKey(p)) {
            return new int[] {l.get(p), i};  // Return the indices as an array
        }
        
        // Add the current element and its index to the map
        l.put(n[i], i);
    }
    
    // Return [-1, -1] if no solution is found
    return new int[] {-1, -1};
}

}