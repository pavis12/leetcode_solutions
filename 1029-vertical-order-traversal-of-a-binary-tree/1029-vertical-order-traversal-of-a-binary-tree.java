class Tuple {
    TreeNode n;
    int r;
    int c;
    Tuple(TreeNode n, int r, int c) {
        this.n = n;
        this.r = r;
        this.c = c;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tuple> q = new LinkedList<>();
        List<List<Integer>> l = new ArrayList<>();
        if (root == null) return l;
        q.add(new Tuple(root, 0, 0));
        
        // TreeMap with column as the key, then row, and PriorityQueue for sorting nodes
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> m = new TreeMap<>();
        
        while (!q.isEmpty()) {
            Tuple t = q.remove();
            TreeNode n = t.n;
            int r = t.r;
            int c = t.c;
            
            m.putIfAbsent(c, new TreeMap<>());
            m.get(c).putIfAbsent(r, new PriorityQueue<>());
            m.get(c).get(r).offer(n.val);
            
            if (n.left != null) q.add(new Tuple(n.left, r + 1, c - 1));
            if (n.right != null) q.add(new Tuple(n.right, r + 1, c + 1));
        }
        
        for (TreeMap<Integer, PriorityQueue<Integer>> col : m.values()) {
            l.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : col.values()) {
                while (!nodes.isEmpty()) {
                    l.get(l.size() - 1).add(nodes.poll());
                }
            }
        }
        return l;
    }
}
