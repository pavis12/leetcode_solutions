class Solution {
    public ListNode oddEvenList(ListNode h) {
        // Edge case: If the list is empty or has only one node, return it as is
        if (h == null || h.next == null) {
            return h;
        }

        ListNode o = h;         // Pointer to the first node (odd indexed)
        ListNode e = h.next;    // Pointer to the second node (even indexed)
        ListNode eh = e;        // Save the head of the even list for linking later

        // Traverse the list and rearrange odd and even nodes
        while (e != null && e.next != null) {
            o.next = e.next;    // Link the next odd node
            o = o.next;         // Move the odd pointer
            e.next = o.next;    // Link the next even node
            e = e.next;         // Move the even pointer
        }

        // Connect the last odd node to the head of the even list
        o.next = eh;

        return h;
    }
}
