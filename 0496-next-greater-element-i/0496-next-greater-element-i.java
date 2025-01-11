class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        Map<Integer, Integer> m = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for (int i = n2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= n2[i]) {
                st.pop(); // Pop smaller elements as they can't be the next greater element
            }
            if (st.isEmpty()) {
                m.put(n2[i], -1); // No greater element
            } else {
                m.put(n2[i], st.peek()); // Top of stack is the next greater element
            }
            st.push(n2[i]); // Push current element into stack
        }
        
        int[] c = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            c[i] = m.get(n1[i]); // Get the next greater element for each element in n1
        }
        return c;
    }
}
