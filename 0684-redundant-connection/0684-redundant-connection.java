class Solution {
    public int[] findRedundantConnection(int[][] e) {
        int l = e.length;
        int[][] d = new int[l + 1][l + 1];
        
        for (int i = 0; i < l; i++) {
            int m = e[i][0];
            int n = e[i][1];
            
            if (!dfs(m, n, m, new boolean[l + 1], d)) {
                return new int[]{m, n};
            }
            
            d[m][n] = 1;
            d[n][m] = 1;
        }
        
        return new int[]{-1, -1};
    }
    
    private boolean dfs(int src, int dest, int node, boolean[] visited, int[][] d) {
        if (node == dest) return false;
        
        visited[node] = true;
        
        for (int next = 1; next < d.length; next++) {
            if (d[node][next] == 1 && !visited[next]) {
                if (!dfs(src, dest, next, visited, d)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
