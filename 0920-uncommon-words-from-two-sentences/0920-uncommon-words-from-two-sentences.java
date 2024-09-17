class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> m = new HashMap<>();
        
        // Split both sentences into words
        String[] h = s1.split(" ");
        String[] g = s2.split(" ");
        
        // Add words from the first sentence to the HashMap
        for (String r : h) {
            m.put(r, m.getOrDefault(r, 0) + 1); // Corrected: m.getOrDefault(r, 0)
        }
        
        // Add words from the second sentence to the HashMap
        for (String r : g) {
            m.put(r, m.getOrDefault(r, 0) + 1); // Corrected: m.getOrDefault(r, 0)
        }
        
        // List to store the uncommon words
        List<String> k = new ArrayList<>();
        
        // Iterate through the HashMap to find words that appear exactly once
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                k.add(entry.getKey());
            }
        }
        
        // Convert the list to an array and return
        return k.toArray(new String[0]); // Simplified the array conversion
    }
}
