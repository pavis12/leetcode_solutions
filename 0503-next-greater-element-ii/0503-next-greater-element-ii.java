class Solution {
    public int[] nextGreaterElements(int[] n) {
        Stack<Integer> st = new Stack<>();
        int[] c = new int[n.length];
        int l=n.length;
        for (int i = 2 * l - 1; i >= 0; i--) {
            int ci=i%l;
             while (!st.isEmpty() && st.peek() <= n[ci]) {
                st.pop(); // Pop smaller elements as they can't be the next greater element
            }
            if (st.isEmpty()) {
                c[ci]=-1; // No greater element
            } else {
                c[ci]=st.peek(); // Top of stack is the next greater element
            }
            st.push(n[ci]);
        }
        return c;
    }
}