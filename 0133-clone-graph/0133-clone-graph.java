/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(node);
        Map<Node, Node> m = new HashMap<>();
        m.put(node, new Node(node.val));

        while (!q.isEmpty()) {
            Node c = q.poll();
            for (Node n : c.neighbors) {
                if (!m.containsKey(n)) {
                    m.put(n, new Node(n.val));
                    q.add(n);
                }
                // Add the cloned neighbor to the cloned node's neighbors list
                m.get(c).neighbors.add(m.get(n));
            }
        }

        return m.get(node);
    }
}
