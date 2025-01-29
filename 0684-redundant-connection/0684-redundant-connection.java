class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        
        // Initialize each node to be its own parent
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            // Check if u and v are already connected
            if (find(parent, u) == find(parent, v)) {
                return edge; // This edge forms a cycle
            }
            
            // Union the two nodes
            union(parent, u, v);
        }
        
        return new int[]{-1, -1};
    }
    
    // Find with path compression
    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]); // Path compression
        }
        return parent[x];
    }
    
    // Union by assigning the parent of one node to the other
    private void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        parent[rootX] = rootY; // Union the two sets
    }
}
