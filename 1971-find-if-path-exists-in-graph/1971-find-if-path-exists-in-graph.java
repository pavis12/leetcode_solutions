class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Constructing adjacency list from given edges
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        return dfs(adjList, visited, source, destination);
    }

    public boolean dfs(List<List<Integer>> adjList, boolean[] visited, int current, int destination) {
        // If we reach the destination, return true
        if (current == destination) {
            return true;
        }

        // Mark the current node as visited
        visited[current] = true;

        // Traverse all adjacent nodes
        for (int neighbor : adjList.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(adjList, visited, neighbor, destination)) {
                    return true;
                }
            }
        }

        // If no valid path is found from this node, return false
        return false;
    }
}
